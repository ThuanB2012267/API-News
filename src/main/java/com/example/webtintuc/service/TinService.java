package com.example.webtintuc.service;

import com.example.webtintuc.model.TinModel;
import com.example.webtintuc.repository.TinRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TinService {
    private final TinRepository tinRepository;

    public TinService(TinRepository tinRepository) {

        this.tinRepository=tinRepository;
    }
    public void addTin(TinModel tin){

        tinRepository.insert(tin);
    }
    public void updateTin(TinModel tin){
        TinModel savedTin = tinRepository.findById(tin.getId())
                .orElseThrow(() -> new RuntimeException(
                        String.format("Cannot Find Tin byu ID %s", tin.getId()))
        );
        savedTin.setTitle(tin.getTitle());
        savedTin.setContent(tin.getContent());
        savedTin.setTinCategory(tin.getTinCategory());
        savedTin.setDate(tin.getDate());
        savedTin.setImage(tin.getImage());

        tinRepository.save(tin);
    }
    public List<TinModel> getallTin(){
        return tinRepository.findAll();
    }
    public TinModel getTinByName(String name){
        return tinRepository.findByName(name).orElseThrow(() -> new RuntimeException(
                String.format("Cannot Find Expense by Name %s", name)
        ));
    }
    public void deleteTin(String id){
        tinRepository.deleteById(id);
    }
}
