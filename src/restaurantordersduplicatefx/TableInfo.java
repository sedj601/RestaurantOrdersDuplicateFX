/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantordersduplicatefx;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author blj0011
 */
public class TableInfo
{

    StringProperty tcPre = new SimpleStringProperty();
    StringProperty tcOne = new SimpleStringProperty();
    StringProperty tcTwo = new SimpleStringProperty();
    StringProperty tcThree = new SimpleStringProperty();
    StringProperty tcFour = new SimpleStringProperty();
    StringProperty tcFive = new SimpleStringProperty();

    public TableInfo(String tcPre, String tcOne, String tcTwo, String tcThree, String tcFour, String tcFive)
    {
        this.tcPre.set(tcPre);
        this.tcOne.set(tcOne);
        this.tcTwo.set(tcTwo);
        this.tcThree.set(tcThree);
        this.tcFour.set(tcFour);
        this.tcFive.set(tcFive);
    }

    public final String getTcPre()
    {
        return tcPre.get();
    }

    public final void setTcPre(String value)
    {
        tcPre.set(value);
    }

    public StringProperty tcPreProperty()
    {
        return tcPre;
    }

    public final String getTcOne()
    {
        return tcOne.get();
    }

    public final void setTcOne(String value)
    {
        tcOne.set(value);
    }

    public StringProperty tcOneProperty()
    {
        return tcOne;
    }

    public final String getTcTwo()
    {
        return tcTwo.get();
    }

    public final void setTcTwo(String value)
    {
        tcTwo.set(value);
    }

    public StringProperty tcTwoProperty()
    {
        return tcTwo;
    }

    public final String getTcThree()
    {
        return tcThree.get();
    }

    public final void setTcThree(String value)
    {
        tcThree.set(value);
    }

    public StringProperty tcThreeProperty()
    {
        return tcThree;
    }

    public final String getTcFour()
    {
        return tcFour.get();
    }

    public final void setTcFour(String value)
    {
        tcFour.set(value);
    }

    public StringProperty tcFourProperty()
    {
        return tcFour;
    }

    public final String getTcFive()
    {
        return tcFive.get();
    }

    public final void setTcFive(String value)
    {
        tcFive.set(value);
    }

    public StringProperty tcFiveProperty()
    {
        return tcFive;
    }

}
