package vicky.Test;

import vicky.ML.SVM.SVMTool;

public class SVMTest {
    public static void main(String[] args){
        //训练集数据文件路径
        String trainDataPath = "C:\\Users\\sdc\\Desktop\\DataMiningAlgorithm-master\\StatisticalLearning\\DataMining_SVM\\trainInput.txt";
        //测试数据文件路径
        String testDataPath = "C:\\Users\\sdc\\Desktop\\DataMiningAlgorithm-master\\StatisticalLearning\\DataMining_SVM\\testInput.txt";

        SVMTool tool = new SVMTool(trainDataPath);
        tool.svmPredictData(testDataPath);
    }
}
