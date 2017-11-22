/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;
import java.util.ArrayList;
/**
 *
 * @author Nelson
 */
public class BlockChain {

    /**
     * @param args the command line arguments
     */
    ArrayList<Block> blockchain = new ArrayList<>();
    public static void main(String[] args) {
        
        String[] genesisTransactions = {"Kachy sent Kaby 100009 bitcoins","Carl sent 200 bitcoins to Kaby"};
        Block genesisBlock = new Block ( 0,genesisTransactions);
        
        String[] block1Transactions = {"Carl sent 10 bitcoins to kave", "Kave sent 10 bitcoin to Kamere"};
        Block block1 = new Block(genesisBlock.getBlockHash(), block1Transactions);
        
        String[] block2Transactions = {"Carl sent 100 bitcoin to sam"};
        Block block2 = new Block(block1.getBlockHash(), block2Transactions);
        
       System.out.println("Hash for genesis block:");
       System.out.println(genesisBlock.getBlockHash());
       
       System.out.println("\nHash of block 1:");
       System.out.println(block1.getBlockHash());
       
       System.out.println("\nHash of block 2:");
       System.out.println(block2.getBlockHash());
    }
    
}
