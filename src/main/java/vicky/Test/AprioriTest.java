package vicky.Test;

import vicky.ML.Apriori.AprioriTool;

/**
        * apriori���������ھ��㷨������
        * @author sdc
        *
        */
public class AprioriTest {

    public static void main(String[] args){
        String filePath = "C:\\Users\\sdc\\Desktop\\DataMiningAlgorithm-master\\AssociationAnalysis\\DataMining_Apriori\\testInput.txt";
        AprioriTool tool = new AprioriTool(filePath, 2);
        tool.printAttachRule(0.7);
    }

}
