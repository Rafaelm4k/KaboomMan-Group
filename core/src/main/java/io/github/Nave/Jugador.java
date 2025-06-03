package io.github.Nave;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Jugador {
    private Texture textura;
    private float x, y;
    private float velocidad = 200f;
    private float ancho = 64, alto = 64; // Tamaño deseado al dibujar

    public Jugador(String rutaImagen, float x, float y) {
        this.textura = new Texture(rutaImagen);
        this.x = x;
        this.y = y;
    }

    public void render(SpriteBatch batch) {
        batch.draw(textura, x, y, ancho, alto);
        actualizar();

    }

    public void dispose() {
        textura.dispose();
    }

    // Métodos para mover al jugador
    public void mover(float dx, float dy) {
        x += dx;
        y += dy;
    }

    private void actualizar() {
        float delta = Gdx.graphics.getDeltaTime();

        if (Gdx.input.isKeyPressed(Input.Keys.LEFT))  x -= velocidad * delta;
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) x += velocidad * delta;
        if (Gdx.input.isKeyPressed(Input.Keys.UP))    y += velocidad * delta;
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN))  y -= velocidad * delta;
    }

    // Getters y setters si necesitás
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
}

