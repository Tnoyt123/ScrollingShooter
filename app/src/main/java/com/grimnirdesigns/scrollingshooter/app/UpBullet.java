package com.grimnirdesigns.scrollingshooter.app;

import android.content.Context;
import android.graphics.Canvas;

public class UpBullet extends Actor {
    private static final int BULLET_SIZE = 32;
    private final int BASE_SPEED = 20;
    private int mSpeed;
    private Sprite mSprite;

    public UpBullet(Context context, int x, int y) {
        super(new Sprite(context, Sprite.BULLET_UP_SPRITE, BULLET_SIZE), x, y);

        mSprite = new Sprite(context, Sprite.BULLET_UP_SPRITE, BULLET_SIZE);
        mSpeed = BASE_SPEED;
    }

    @Override
    public void update() {
        setY(getY() - mSpeed);
    }

    @Override
    public void draw(Canvas canvas) {
        mSprite.draw(canvas, getX() - BULLET_SIZE / 2, getY() - BULLET_SIZE / 2);
    }
}
