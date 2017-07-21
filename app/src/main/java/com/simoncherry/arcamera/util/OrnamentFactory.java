package com.simoncherry.arcamera.util;

import android.graphics.Color;

import com.simoncherry.arcamera.R;
import com.simoncherry.arcamera.model.Ornament;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simon on 2017/7/19.
 */

public class OrnamentFactory {
    public final static int NO_COLOR = 2333;

    public static List<Ornament> getPresetOrnament() {
        List<Ornament> ornaments = new ArrayList<>();
        ornaments.add(getNoOrnament());
//        ornaments.add(getGlass());
//        ornaments.add(getMoustache());
//        ornaments.add(getHeart());
//        ornaments.add(getCatEar());
        ornaments.add(getTigerNose());
//        ornaments.add(getCatMask());
//        ornaments.add(getPantherMask());
        ornaments.add(getVMask());
//        ornaments.add(getDevilMask());
//        ornaments.add(getGasMask());
//        ornaments.add(getIronMan());
//        ornaments.add(getRingHat());
        return ornaments;
    }

    private static Ornament getNoOrnament() {
        Ornament ornament = new Ornament();
        ornament.setModelResId(-1);
        ornament.setImgResId(R.drawable.ic_remove);
        return ornament;
    }

//    private Ornament getGlass() {
//        Ornament ornament = new Ornament();
//        ornament.setModelResId(R.raw.glasses_obj);
//        ornament.setImgResId(R.drawable.ic_glasses);
//        ornament.setScale(0.005f);
//        ornament.setOffset(0, 0, 0.2f);
//        ornament.setRotate(-90.0f, 90.0f, 90.0f);
//        ornament.setColor(Color.BLACK);
//        return ornament;
//    }
//
//    private Ornament getMoustache() {
//        Ornament ornament = new Ornament();
//        ornament.setModelResId(R.raw.moustache_obj);
//        ornament.setImgResId(R.drawable.ic_moustache);
//        ornament.setScale(0.15f);
//        ornament.setOffset(0, -0.25f, 0.2f);
//        ornament.setRotate(-90.0f, 90.0f, 90.0f);
//        ornament.setColor(Color.BLACK);
//        return ornament;
//    }
//
//    private Ornament getCatEar() {
//        Ornament ornament = new Ornament();
//        ornament.setModelResId(R.raw.cat_ear_obj);
//        ornament.setImgResId(R.drawable.ic_cat);
//        ornament.setScale(11.0f);
//        ornament.setOffset(0, 0.6f, -0.2f);
//        ornament.setRotate(0.0f, 0.0f, 0.0f);
//        ornament.setColor(0xffe06666);
//
//        List<Animation3D> animation3Ds = new ArrayList<>();
//        Animation3D anim = new RotateOnAxisAnimation(Vector3.Axis.X, -30);
//        anim.setDurationMilliseconds(300);
//        anim.setInterpolator(new AccelerateDecelerateInterpolator());
//        anim.setRepeatCount(2);
//        animation3Ds.add(anim);
//        ornament.setAnimation3Ds(animation3Ds);
//
//        return ornament;
//    }

    private static Ornament getTigerNose() {
        Ornament ornament = new Ornament();
        ornament.setModelResId(R.raw.tiger_nose_obj);
        ornament.setImgResId(R.drawable.ic_tiger);
        ornament.setScale(0.002f);
        ornament.setOffset(0, -0.2f, 0.4f);
        ornament.setRotate(0.0f, 0.0f, 0.0f);
        ornament.setColor(0xffe06666);
        return ornament;
    }

//    private Ornament getHeart() {
//        Ornament ornament = new Ornament();
//        ornament.setModelResId(R.raw.heart_eyes_obj);
//        ornament.setImgResId(R.drawable.ic_heart);
//        ornament.setScale(0.17f);
//        ornament.setOffset(0, 0.0f, 0.1f);
//        ornament.setRotate(0.0f, 0.0f, 0.0f);
//        ornament.setColor(0xffcc0000);
//
//        List<Animation3D> animation3Ds = new ArrayList<>();
//        Animation3D anim = new ScaleAnimation3D(new Vector3(0.3f, 0.3f, 0.3f));
//        anim.setDurationMilliseconds(300);
//        anim.setInterpolator(new LinearInterpolator());
//        animation3Ds.add(anim);
//        ornament.setAnimation3Ds(animation3Ds);
//        return ornament;
//    }

    private static Ornament getVMask() {
        Ornament ornament = new Ornament();
        ornament.setModelResId(R.raw.v_mask_obj);
        ornament.setImgResId(R.drawable.ic_v_mask);
        ornament.setScale(0.15f);
        ornament.setOffset(0, 0.01f, 0.0f);
        ornament.setRotate(0, 0, 0);
        ornament.setColor(Color.BLACK);
        return ornament;
    }

//    private Ornament getCatMask() {
//        Ornament ornament = new Ornament();
//        ornament.setModelResId(R.raw.cat_mask_obj);
//        ornament.setImgResId(R.drawable.ic_cat_mask);
//        ornament.setScale(0.12f);
//        ornament.setOffset(0, -0.1f, -0.1f);
//        ornament.setRotate(0, 0, 0);
//        ornament.setColor(Color.DKGRAY);
//        return ornament;
//    }
//
//    private Ornament getPantherMask() {
//        Ornament ornament = new Ornament();
//        ornament.setModelResId(R.raw.panther_obj);
//        ornament.setImgResId(R.drawable.ic_panther_mask);
//        ornament.setScale(0.12f);
//        ornament.setOffset(0, -0.1f, 0.0f);
//        ornament.setRotate(0, 0, 0);
//        ornament.setColor(NO_COLOR);
//        return ornament;
//    }
//
//    private Ornament getDevilMask() {
//        Ornament ornament = new Ornament();
//        ornament.setModelResId(R.raw.devil_mask_obj);
//        ornament.setImgResId(R.drawable.ic_devil_mask);
//        ornament.setScale(0.13f);
//        ornament.setOffset(0, -0.15f, 0.0f);
//        ornament.setRotate(0, 0, 0);
//        ornament.setColor(0xff660000);
//        return ornament;
//    }
//
//    private Ornament getGasMask() {
//        Ornament ornament = new Ornament();
//        ornament.setModelResId(R.raw.gas_mask_obj);
//        ornament.setImgResId(R.drawable.ic_gas_mask);
//        ornament.setScale(0.11f);
//        ornament.setOffset(0, -0.2f, 0.0f);
//        ornament.setRotate(0, 0, 0);
//        ornament.setColor(0xff333333);
//        return ornament;
//    }
//
//    private Ornament getIronMan() {
//        Ornament ornament = new Ornament();
//        ornament.setModelResId(R.raw.iron_man_obj);
//        ornament.setImgResId(R.drawable.ic_iron_man);
//        ornament.setScale(0.11f);
//        ornament.setOffset(0, -0.1f, 0.0f);
//        ornament.setRotate(0, 0, 0);
//        ornament.setColor(NO_COLOR);
//        return ornament;
//    }
//
//    private Ornament getRingHat() {
//        Ornament ornament = new Ornament();
//        ornament.setModelResId(R.raw.ring_hat_obj);
//        ornament.setImgResId(R.drawable.ic_ring_hat);
//        ornament.setScale(0.12f);
//        ornament.setOffset(0, 0.2f, 0.0f);
//        ornament.setRotate(0, 0, 0);
//        ornament.setColor(NO_COLOR);
//        return ornament;
//    }


    public static List<Ornament> getPresetMask() {
        List<Ornament> ornaments = new ArrayList<>();
//        ornaments.add(getNoOrnament());
        ornaments.add(getMask(R.drawable.average_male, R.drawable.mask_man));
        ornaments.add(getMask(R.drawable.average_female, R.drawable.mask_woman));
        ornaments.add(getMask(R.drawable.lion_texture, R.drawable.mask_lion));
        ornaments.add(getMask(R.drawable.skull_texture, R.drawable.mask_skull));
        return ornaments;
    }

    private static Ornament getMask(int textureResId, int imgResId) {
        Ornament ornament = new Ornament();
        ornament.setFaceMask(true);
        ornament.setModelResId(R.raw.base_face_uv3_obj);
        ornament.setTextureResId(textureResId);
        ornament.setImgResId(imgResId);
        ornament.setScale(0.25f);
        ornament.setOffset(0, 0, 0);
        ornament.setRotate(0, 0, 0);
        ornament.setColor(NO_COLOR);
        return ornament;
    }

    public static Ornament getMask(String texturePath) {
        Ornament ornament = new Ornament();
        ornament.setFaceMask(true);
        ornament.setModelResId(-1);
        ornament.setTexturePath(texturePath);
        ornament.setImgResId(0);
        ornament.setScale(0.25f);
        ornament.setOffset(0, 0, 0);
        ornament.setRotate(0, 0, 0);
        ornament.setColor(NO_COLOR);
        return ornament;
    }
}