/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.api.crudmahasiswa.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author alghifaris.bagaskara
 */
@Data
@NoArgsConstructor
public class MahasiswaDTO 
{
    private Long Id;
    private String Name;
    private String Gender;    
}
