package com.bdg.hhakobyan;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class ResourceManagementTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(ResourceManagement.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Test
    public void addEmployeeToDepartment() {
    }

    @org.junit.Test
    public void removeEmployeeFromDepartment() {
    }

    @org.junit.Test
    public void searchDepartment() {
    }

    @org.junit.Test
    public void findEmployeeByName() {
    }

    @org.junit.Test
    public void findDepartmentByname() {
    }

    @org.junit.Test
    public void getDepartmentWithMaxSalary() {
    }
}
