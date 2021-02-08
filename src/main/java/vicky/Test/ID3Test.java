package vicky.Test;

import vicky.ML.ID3.ID3Tool;

/**
 * ID3决策树分类算法测试场景类
 * @author sdc
 *
 */

public class ID3Test {
    public static void main(String[] args){
        String filePath = "C:\\Users\\sdc\\Desktop\\DataMiningAlgorithm-master\\Classification\\DataMining_ID3\\input.txt";

        ID3Tool tool = new ID3Tool(filePath);
        tool.startBuildingTree(true);
    }
}
