/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan61.bangunruang;

/**
 *
 * @author Firman Alfinas
 */
public class Bola extends BangunRuang{
     @Override
    public float hitungVolume() {
        return (4* (PHI*getR()*getR()*getR()))/3;
    }
}