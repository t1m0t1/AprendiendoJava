/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array;

/**
 *
 * @author ti3m
 */
public class magica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        //int[][] cubo1 = new int[3][3];
        int[][] cubo1 = {{5, 5, 5}, {5, 5, 5}, {5, 5, 5}};
        int f1 = 0, f2 = 0, f3 = 0, c1 = 0, c2 = 0, c3 = 0, d1 = 0, d2 = 0;
        
        for (int i = 0; i < cubo1.length; i++) {
            for (int j = 0; j < cubo1.length; j++) {
                
                //cubo1 [i][j] = (int)( Math.random()*10);
                cubo1 [i][j] = 5;
                
                                if (i == 0) {
                    f1 += cubo1[i][j];
                } else if (i == 1) {
                    f2 += cubo1[i][j];
                } else if (i == 2) {
                    f3 += cubo1[i][j];
                }
                if (j == 0) {
                    c1 += cubo1[i][j];
                } else if (j == 1) {
                    c2 += cubo1[i][j];
                } else if (j == 2) {
                    c3 += cubo1[i][j];
                }
                if (i==0 && j==2 || i==1 && j==1 || i==2 && j==0){
                    d2 += cubo1 [i][j];
                }
                if (i==0 && j==0 || i==1 && j==1 || i==2 && j==2){
                    d1 += cubo1[i][j];                    
                }     
            }
        }
        
        
           
        for (int i = 0; i < cubo1.length; i++) {
            for (int j = 0; j < cubo1.length; j++) {

                    
            }
        }
        
        
        System.out.println("f1= " + f1 + " f2= " + f2+ " c1= "+c1+ " c2= "+c2+ " d1= "+d1+ " d2= "+d2);
        if(f1==f2 && f2==f3 && f3==c1 && c1==c2 && c2==c3 && c3==d1 && d1==d2){
            System.out.println("La matriz es mágica");
        }else{
            System.out.println("La matriz no es mágica");
        }
    }
    }


