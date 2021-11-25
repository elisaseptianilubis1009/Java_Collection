/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class TestAstro {

    public static void main(String[] args) {

        int saham[] = {7, 1, 2, 3, 6, 5, 9};
        int sahamMin = 0, sahamMax = 0;

        for (int i = 0; i < saham.length; i++) {
            for (int j = i + 1; j < saham.length; j++) {
                if (saham[i] < saham[j]) {
                    sahamMin = saham[i];
                }
                for (int k = j + 1; k < saham.length; k++) {
                    if (saham[j] > saham[k]) {
                        if (saham[j] > sahamMax) {
                            sahamMax = saham[j];
                            System.out.println("Saham Max if :" + sahamMax);
                        }

                    }
                }
            }
        }
        System.out.println(sahamMax - sahamMin);
        System.out.println(sahamMin);

        System.out.println(sahamMax);

    }

}
