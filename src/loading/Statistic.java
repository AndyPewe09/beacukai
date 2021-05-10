/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loading;

/**
 *
 * @author k401u
 */
public interface Statistic {
    public void lifeTimeStatistic();
    public void yearlyStatistic(String idTahun);
    public void monthlyStatistic(String idBulan);
    public void weeklyStatistic(String idMinggu);
}
