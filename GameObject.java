import greenfoot.*;

public abstract class GameObject implements Drawable, Transformable
{
    private Transformation _transformation;
    
    protected GameObject()
    {
        _transformation = new Transformation();
    }

    public Transformation getTransformation() 
    {
        return _transformation;
    }

    public abstract void draw(GreenfootImage canvas, Camera camera);

    public void update(double deltaTime)
    {
        // Overriden by derived classes.
    }
}