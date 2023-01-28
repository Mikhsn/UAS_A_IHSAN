/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_A.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author AyUmiYuNo1
 */
public abstract class NasabahDaoImpl implements NasabahDao {
    List<Nasabah> data = new ArrayList<>();

    public NasabahDaoImpl() {
        data.add(new Nasabah("1111", "salsa"));
        data.add(new Nasabah("1112", "bila"));
        data.add(new Nasabah("1113", "okta"));
    }
    
    public void save(Nasabah nasabah){
        data.add(nasabah);
    }
    public void update(int index, Nasabah nasabah){
        data.set(index, nasabah);
    }
    public void delete (int index){
        data.remove(index);
    }
    public Nasabah getNasabah(int index){
        return data.get(index);
    }
    
    public List<Nasabah> getAll(){
        return data;
    }
}
