<<<<<<< HEAD
package com.example.services;

import com.example.models.CategoryMaster;
import com.example.models.PackageMaster;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<CategoryMaster> getRootCategories();

    List<CategoryMaster> getSubcategories(String parentName);

    Integer getCategoryMasterIdByCtgId(String ctgId);

    List<PackageMaster> getPackagesByCategoryMasterId(Integer ctgMasterId);

    List<CategoryMaster> getSpecialCategories();
=======
package com.example.services;

import com.example.models.CategoryMaster;
import com.example.models.PackageMaster;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<CategoryMaster> getRootCategories();

    List<CategoryMaster> getSubcategories(String parentName);

    Integer getCategoryMasterIdByCtgId(String ctgId);

    List<PackageMaster> getPackagesByCategoryMasterId(Integer ctgMasterId);

    List<CategoryMaster> getSpecialCategories();
>>>>>>> 48697232c3c3a8a21e62f23700a5e4ed9eb3ad59
}