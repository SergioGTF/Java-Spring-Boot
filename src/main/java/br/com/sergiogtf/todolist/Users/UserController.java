package br.com.sergiogtf.todolist.Users;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/usuários")
public class UserController {
    /**
     * String (texto)
     * Integer (int) números inteiros
     * Double (double) Número 0.0000
     * Float (float) Números 0.000
     * Char (A C )
     * Date (data)
     * void 
     */
    /*
     * Body
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){
        System.out.println(userModel.name);
    } 
}
