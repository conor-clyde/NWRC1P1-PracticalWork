package test;

import java.util.Objects;

public class Engineer 
{
    private String s_n;
    private int _score;
    private String sx;


    public Engineer(String name, int sc, String sex) 
    {
        s_n = name;
        _score = sc;
        sx = sex;
    }

    @Override
    public boolean equals(Object o) 
    {
        Engineer engineer = (Engineer) o;
        
        return _score == engineer._score;
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(sx);
    }
}
