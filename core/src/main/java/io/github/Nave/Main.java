package io.github.Nave;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image;
    private Jugador jugador;

    @Override
    public void create() {
        batch = new SpriteBatch();
        image = new Texture("mapa.jpg");
        jugador = new Jugador("marroqui.png",10,20);
    }

    @Override
    public void render() {

        ScreenUtils.clear(1f, 1f, 1f, 1f);
        batch.begin();
        jugador.render(batch);
        batch.end();
    }


    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
        jugador.dispose();
    }
}
