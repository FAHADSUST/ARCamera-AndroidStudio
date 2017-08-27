package com.simoncherry.arcamera.model;

import org.rajawali3d.Object3D;
import org.rajawali3d.animation.Animation3D;
import org.rajawali3d.materials.plugins.IMaterialPlugin;

import java.util.List;

/**
 * Created by Simon on 2017/6/25.
 */

public class Ornament {
    private List<Object3D> object3DList;
    private List<List<IMaterialPlugin>> materialList;
    private float timeStep;

    private int modelResId;
    private int imgResId;
    private float scale;
    private float offsetX;
    private float offsetY;
    private float offsetZ;
    private float rotateX;
    private float rotateY;
    private float rotateZ;
    private int color;
    private List<Animation3D> animation3Ds;
    private int textureResId = -1;
    private String texturePath = null;
    private boolean isFaceMask;

    public List<Object3D> getObject3DList() {
        return object3DList;
    }

    public void setObject3DList(List<Object3D> mObject3DList) {
        this.object3DList = mObject3DList;
    }

    public List<List<IMaterialPlugin>> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<List<IMaterialPlugin>> materialList) {
        this.materialList = materialList;
    }

    public float getTimeStep() {
        return timeStep;
    }

    public void setTimeStep(float timeStep) {
        this.timeStep = timeStep;
    }

    public int getModelResId() {
        return modelResId;
    }

    public void setModelResId(int modelResId) {
        this.modelResId = modelResId;
    }

    public int getImgResId() {
        return imgResId;
    }

    public void setImgResId(int imgResId) {
        this.imgResId = imgResId;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public float getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(float offsetX) {
        this.offsetX = offsetX;
    }

    public float getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(float offsetY) {
        this.offsetY = offsetY;
    }

    public float getOffsetZ() {
        return offsetZ;
    }

    public void setOffsetZ(float offsetZ) {
        this.offsetZ = offsetZ;
    }

    public float getRotateX() {
        return rotateX;
    }

    public void setRotateX(float rotateX) {
        this.rotateX = rotateX;
    }

    public float getRotateY() {
        return rotateY;
    }

    public void setRotateY(float rotateY) {
        this.rotateY = rotateY;
    }

    public float getRotateZ() {
        return rotateZ;
    }

    public void setRotateZ(float rotateZ) {
        this.rotateZ = rotateZ;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public List<Animation3D> getAnimation3Ds() {
        return animation3Ds;
    }

    public void setAnimation3Ds(List<Animation3D> animation3Ds) {
        this.animation3Ds = animation3Ds;
    }

    public int getTextureResId() {
        return textureResId;
    }

    public void setTextureResId(int textureResId) {
        this.textureResId = textureResId;
    }

    public String getTexturePath() {
        return texturePath;
    }

    public void setTexturePath(String texturePath) {
        this.texturePath = texturePath;
    }

    public boolean isFaceMask() {
        return isFaceMask;
    }

    public void setFaceMask(boolean faceMask) {
        isFaceMask = faceMask;
    }

    public void setOffset(float x, float y, float z) {
        setOffsetX(x);
        setOffsetY(y);
        setOffsetZ(z);
    }

    public void setRotate(float x, float y, float z) {
        setRotateX(x);
        setRotateY(y);
        setRotateZ(z);
    }
}
