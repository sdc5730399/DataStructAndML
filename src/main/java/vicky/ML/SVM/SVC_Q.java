package vicky.ML.SVM;

//
// Q matrices for various formulations
//
class SVC_Q extends Kernel
{
    private final byte[] y;
    private final Cache cache;
    private final float[] QD;

    SVC_Q(svm_problem prob, svm_parameter param, byte[] y_)
    {
        super(prob.l, prob.x, param);
        y = (byte[])y_.clone();
        cache = new Cache(prob.l,(long)(param.cache_size*(1<<20)));
        QD = new float[prob.l];
        for(int i=0;i<prob.l;i++)
            QD[i]= (float)kernel_function(i,i);
    }

    float[] get_Q(int i, int len)
    {
        float[][] data = new float[1][];
        int start, j;
        if((start = cache.get_data(i,data,len)) < len)
        {
            for(j=start;j<len;j++)
                data[0][j] = (float)(y[i]*y[j]*kernel_function(i,j));
        }
        return data[0];
    }

    float[] get_QD()
    {
        return QD;
    }

    void swap_index(int i, int j)
    {
        cache.swap_index(i,j);
        super.swap_index(i,j);
        do {byte _=y[i]; y[i]=y[j]; y[j]=_;} while(false);
        do {float _=QD[i]; QD[i]=QD[j]; QD[j]=_;} while(false);
    }
}