package vicky.Test;

import vicky.ML.SVM.SVMTool;

public class SVMTest {
    public static void main(String[] args){
        //ѵ���������ļ�·��
        String trainDataPath = "C:\\Users\\sdc\\Desktop\\DataMiningAlgorithm-master\\StatisticalLearning\\DataMining_SVM\\trainInput.txt";
        //���������ļ�·��
        String testDataPath = "C:\\Users\\sdc\\Desktop\\DataMiningAlgorithm-master\\StatisticalLearning\\DataMining_SVM\\testInput.txt";

        SVMTool tool = new SVMTool(trainDataPath);
        tool.svmPredictData(testDataPath);
    }
}
