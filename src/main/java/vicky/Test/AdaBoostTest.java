package vicky.Test;

import vicky.ML.AdaBoost.AdaBoostTool;

/**
 * AdaBoost�����㷨������
 * @author lyq
 *
 */
public class AdaBoostTest {

    public static void main(String[] agrs){
        String filePath = "C:\\Users\\sdc\\Desktop\\DataMiningAlgorithm-master\\BaggingAndBoosting\\DataMining_AdaBoost\\input.txt";
        //�������ֵ
        double errorValue = 0.2;
        AdaBoostTool tool = new AdaBoostTool(filePath, errorValue);
        tool.adaBoostClassify();
    }
}
