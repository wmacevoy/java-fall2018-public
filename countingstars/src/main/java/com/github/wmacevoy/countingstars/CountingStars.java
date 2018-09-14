/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.wmacevoy.countingstars;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author wmacevoy
 * 
 * Solves: https://open.kattis.com/problems/countingstars
 */
public class CountingStars {

    public static void main(String[] args) throws Exception {
        CountingStars countingStars = new CountingStars();
        countingStars.go();
    }

    void go() throws Exception {
        in = new Scanner(System.in);
        out = System.out;

        for (;;) {
            if (haveTestCase()) {
                readTestCase();
                solve();
                writeTestCase();
            } else {
                break;
            }
        }
    }

    Scanner in;
    PrintStream out;
    
    int rows;
    int columns;
    int stars;
    boolean[][] picture;
    int caseNumber;
    
    private boolean haveTestCase() {
        return in.hasNextInt();
    }

    private void readTestCase() {
        rows = in.nextInt();
        columns = in.nextInt();
        in.nextLine();
        picture = new boolean[rows][columns];
        for (int row = 0; row < rows; ++row) {
            String line = in.nextLine();
            picture[row] = parseRow(line);
        }
        ++caseNumber;
    }

    void solve() {
        stars = 0;
        for (int row = 0; row < rows; ++row) {
            for (int column = 0; column < columns; ++column) {
                if (picture[row][column]) {
                    ++stars;
                    erase(row, column);
                }
            }
        }
    }

    private void writeTestCase() {
        out.println("Case " + caseNumber + ": "+stars);
    }

    private void erase(int row, int column) {
        picture[row][column] = false;
        if (row + 1 < rows && picture[row + 1][column]) {
            erase(row + 1, column);
        }
        if (row - 1 >= 0 && picture[row - 1][column]) {
            erase(row - 1, column);
        }
        if (column + 1 < columns && picture[row][column + 1]) {
            erase(row, column + 1);
        }
        if (column - 1 >= 0 && picture[row][column - 1]) {
            erase(row, column - 1);
        }
    }

    boolean[] parseRow(String string) {
        boolean[] data = new boolean[string.length()];
        for (int column = 0; column < string.length(); ++column) {
            data[column] = (string.charAt(column) == '-');
        }
        return data;
    }
}
