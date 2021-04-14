package br.ufscar.dc.pc;

/**
 * @author 743546
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copia {

    public void Copia(String fileIn, String fileOut, char old, char n) {
        int i;

        try {
            FileReader fr = new FileReader(fileIn);
            BufferedReader input = new BufferedReader(fr);

            FileWriter fw = new FileWriter(fileOut);
            BufferedWriter output = new BufferedWriter(fw);

            while ((i = fr.read()) != -1) {
                if (((char) i) == old) {
                    fw.write(n);
                } else {
                    fw.write(old);
                }
            }

            input.close();
            output.close();
        } catch (IOException e) {

        }

    }
}
