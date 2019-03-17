package com.bdg.spapoyan.generic;

public class Pair <U, V>
{
    private U u;
    private V v;

    Pair() {
    }

    public Pair(U u, V v)
    {
        this.u = u;
        this.v = v;
    }

    public U getU()
    {
        return u;
    }

    public void setU(U u)
    {
        this.u = u;
    }

    public V getV()
    {
        return v;
    }

    public void setV(V v)
    {
        this.v = v;
    }

    @Override
    public String toString()
    {
        return "Pair{" + "u=" + u + ", v=" + v + '}';
    }
}
