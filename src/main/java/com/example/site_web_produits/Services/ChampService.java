package com.example.site_web_produits.Services;

import com.example.site_web_produits.DAO.ChampRepository;
import com.example.site_web_produits.models.Category;
import com.example.site_web_produits.models.Champ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChampService {
    
    @Autowired
    ChampRepository champRepository;
    
    public  ChampService (ChampRepository champRepository){
        this.champRepository = champRepository;
    }
    
    public void save(List<Champ> champList, Category cat){

        for (Champ champ: champList
             ) {
            champ.setCategory(cat);
            champRepository.save(champ);
        }
    }
}
