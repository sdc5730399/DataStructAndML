package vicky.Test;

import vicky.ML.EM.EMTool;

public class EMTest {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\sdc\\Desktop\\DataMiningAlgorithm-master\\StatisticalLearning\\DataMining_EM\\input.txt";
        EMTool tool = new EMTool(filePath);
        tool.readDataFile();
        tool.exceptMaxStep();

    }
}
