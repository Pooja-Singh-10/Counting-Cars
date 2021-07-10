/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Pooja
 */
public class CountingCarEnterprise extends Enterprise {

    public CountingCarEnterprise(String name) {
        super(name, EnterpriseType.CarCooper);

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
