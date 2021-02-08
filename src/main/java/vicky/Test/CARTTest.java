package vicky.Test;

import vicky.ML.CART.CARTTool;

public class CARTTest {
    public static void main(String [] args ){

        String filePath = "C:\\Users\\sdc\\Desktop\\DataMiningAlgorithm-master\\Classification\\DataMining_CART\\input.txt";

        CARTTool tool = new CARTTool(filePath);

        tool.startBuildingTree();
    }
}
