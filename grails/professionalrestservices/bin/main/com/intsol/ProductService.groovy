package com.intsol

import grails.gorm.services.Service

@Service(Product)
interface ProductService {

    List<Product> findByNameLike(String name, Map args)

}
