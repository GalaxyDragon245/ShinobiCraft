// Made with Blockbench 3.7.2
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class ModelHikari1Tail extends EntityModel<Entity> {
	private final ModelRenderer NewOneTail;
	private final ModelRenderer Cloak;
	private final ModelRenderer CloakHead;
	private final ModelRenderer RightEar;
	private final ModelRenderer LeftEar;
	private final ModelRenderer CloakBody;
	private final ModelRenderer CloakArms;
	private final ModelRenderer CloakLeftArm;
	private final ModelRenderer CloakLeftClaws;
	private final ModelRenderer LeftClawLayer1;
	private final ModelRenderer LeftClawLayer2;
	private final ModelRenderer CloakRightArm;
	private final ModelRenderer CloakRightClaws;
	private final ModelRenderer RightClawLayer3;
	private final ModelRenderer RightClawLayer2;
	private final ModelRenderer CloakLegs;
	private final ModelRenderer CloakLeftLeg;
	private final ModelRenderer LeftClawLayer3;
	private final ModelRenderer LeftClawLayer4;
	private final ModelRenderer CloakRightLeg2;
	private final ModelRenderer CloakRightClaws2;
	private final ModelRenderer RightClawLayer4;
	private final ModelRenderer RightClawLayer5;
	private final ModelRenderer Tail;
	private final ModelRenderer TailBone2;
	private final ModelRenderer TailBone3;
	private final ModelRenderer TailBone4;
	private final ModelRenderer TailBone5;
	private final ModelRenderer TailBone6;
	private final ModelRenderer TailBone7;
	private final ModelRenderer TailBone8;
	private final ModelRenderer TailBone9;
	private final ModelRenderer TailBone10;
	private final ModelRenderer TailBone11;
	private final ModelRenderer TailBone12;
	private final ModelRenderer TailBone13;
	private final ModelRenderer TailBone14;
	private final ModelRenderer TailBone15;

	public ModelHikari1Tail() {
		textureWidth = 128;
		textureHeight = 128;

		NewOneTail = new ModelRenderer(this);
		NewOneTail.setRotationPoint(5.0F, 2.0F, 0.0F);

		Cloak = new ModelRenderer(this);
		Cloak.setRotationPoint(0.25F, -3.5F, -0.5F);
		NewOneTail.addChild(Cloak);

		CloakHead = new ModelRenderer(this);
		CloakHead.setRotationPoint(-5.25F, 1.9167F, 0.5F);
		Cloak.addChild(CloakHead);
		CloakHead.setTextureOffset(0, 0).addBox(-5.0F, -8.9167F, -5.0F, 10.0F, 9.0F, 10.0F, 0.0F, false);

		RightEar = new ModelRenderer(this);
		RightEar.setRotationPoint(-4.6F, -8.9167F, 0.7F);
		CloakHead.addChild(RightEar);
		setRotationAngle(RightEar, 0.0F, 0.0F, 0.0F);
		RightEar.setTextureOffset(18, 54).addBox(-1.15F, -1.0F, -2.2F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		RightEar.setTextureOffset(50, 40).addBox(-1.15F, -2.0F, -1.45F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		RightEar.setTextureOffset(39, 47).addBox(-1.15F, -3.0F, -0.95F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		RightEar.setTextureOffset(0, 21).addBox(-1.15F, -4.0F, -0.45F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightEar.setTextureOffset(0, 5).addBox(-0.9F, 0.0F, -1.45F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		LeftEar = new ModelRenderer(this);
		LeftEar.setRotationPoint(4.6F, -8.9167F, 0.7F);
		CloakHead.addChild(LeftEar);
		LeftEar.setTextureOffset(0, 56).addBox(-2.85F, -1.0F, -2.2F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		LeftEar.setTextureOffset(44, 19).addBox(-1.85F, -2.0F, -1.45F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		LeftEar.setTextureOffset(59, 40).addBox(-0.85F, -3.0F, -0.95F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		LeftEar.setTextureOffset(0, 23).addBox(0.15F, -4.0F, -0.45F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftEar.setTextureOffset(22, 19).addBox(-0.1F, 0.0F, -1.45F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		CloakBody = new ModelRenderer(this);
		CloakBody.setRotationPoint(-5.25F, 7.5F, 0.5F);
		Cloak.addChild(CloakBody);
		CloakBody.setTextureOffset(0, 19).addBox(-4.0F, -6.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.0F, false);

		CloakArms = new ModelRenderer(this);
		CloakArms.setRotationPoint(-5.25F, 1.5F, 0.5F);
		Cloak.addChild(CloakArms);

		CloakLeftArm = new ModelRenderer(this);
		CloakLeftArm.setRotationPoint(3.5F, 0.0F, 0.0F);
		CloakArms.addChild(CloakLeftArm);
		CloakLeftArm.setTextureOffset(44, 44).addBox(0.0F, -0.5F, -3.0F, 5.0F, 13.0F, 6.0F, 0.0F, false);

		CloakLeftClaws = new ModelRenderer(this);
		CloakLeftClaws.setRotationPoint(-3.5F, 24.0F, 0.0F);
		CloakLeftArm.addChild(CloakLeftClaws);

		LeftClawLayer1 = new ModelRenderer(this);
		LeftClawLayer1.setRotationPoint(1.5F, -20.25F, -2.0F);
		CloakLeftClaws.addChild(LeftClawLayer1);
		LeftClawLayer1.setTextureOffset(4, 50).addBox(6.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftClawLayer1.setTextureOffset(4, 50).addBox(4.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftClawLayer1.setTextureOffset(4, 50).addBox(2.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftClawLayer2 = new ModelRenderer(this);
		LeftClawLayer2.setRotationPoint(1.5F, -19.75F, -2.5F);
		CloakLeftClaws.addChild(LeftClawLayer2);
		LeftClawLayer2.setTextureOffset(4, 50).addBox(6.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftClawLayer2.setTextureOffset(4, 50).addBox(4.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftClawLayer2.setTextureOffset(4, 50).addBox(2.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		CloakRightArm = new ModelRenderer(this);
		CloakRightArm.setRotationPoint(-3.5F, 0.0F, 0.0F);
		CloakArms.addChild(CloakRightArm);
		CloakRightArm.setTextureOffset(40, 0).addBox(-5.0F, -0.5F, -3.0F, 5.0F, 13.0F, 6.0F, 0.0F, false);

		CloakRightClaws = new ModelRenderer(this);
		CloakRightClaws.setRotationPoint(-8.5F, 24.0F, 0.0F);
		CloakRightArm.addChild(CloakRightClaws);

		RightClawLayer3 = new ModelRenderer(this);
		RightClawLayer3.setRotationPoint(1.5F, -20.25F, -2.0F);
		CloakRightClaws.addChild(RightClawLayer3);
		RightClawLayer3.setTextureOffset(4, 50).addBox(6.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightClawLayer3.setTextureOffset(4, 50).addBox(4.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightClawLayer3.setTextureOffset(4, 50).addBox(2.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		RightClawLayer2 = new ModelRenderer(this);
		RightClawLayer2.setRotationPoint(1.5F, -19.75F, -2.5F);
		CloakRightClaws.addChild(RightClawLayer2);
		RightClawLayer2.setTextureOffset(4, 50).addBox(6.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightClawLayer2.setTextureOffset(4, 50).addBox(4.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightClawLayer2.setTextureOffset(4, 50).addBox(2.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		CloakLegs = new ModelRenderer(this);
		CloakLegs.setRotationPoint(-4.75F, 25.5F, 0.25F);
		Cloak.addChild(CloakLegs);

		CloakLeftLeg = new ModelRenderer(this);
		CloakLeftLeg.setRotationPoint(1.8333F, -12.0833F, 0.3333F);
		CloakLegs.addChild(CloakLeftLeg);
		CloakLeftLeg.setTextureOffset(0, 37).addBox(-2.3333F, -0.6667F, -2.8333F, 5.0F, 13.0F, 6.0F, 0.0F, false);

		LeftClawLayer3 = new ModelRenderer(this);
		LeftClawLayer3.setRotationPoint(-4.3333F, 3.3333F, -2.0833F);
		CloakLeftLeg.addChild(LeftClawLayer3);
		LeftClawLayer3.setTextureOffset(4, 50).addBox(6.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftClawLayer3.setTextureOffset(4, 50).addBox(4.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftClawLayer3.setTextureOffset(4, 50).addBox(2.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftClawLayer4 = new ModelRenderer(this);
		LeftClawLayer4.setRotationPoint(-4.3333F, 3.5833F, -2.5833F);
		CloakLeftLeg.addChild(LeftClawLayer4);
		LeftClawLayer4.setTextureOffset(4, 50).addBox(6.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftClawLayer4.setTextureOffset(4, 50).addBox(4.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftClawLayer4.setTextureOffset(4, 50).addBox(2.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		CloakRightLeg2 = new ModelRenderer(this);
		CloakRightLeg2.setRotationPoint(-2.75F, -12.0F, 0.25F);
		CloakLegs.addChild(CloakRightLeg2);
		CloakRightLeg2.setTextureOffset(28, 28).addBox(-2.75F, -0.75F, -2.75F, 5.0F, 13.0F, 6.0F, 0.0F, false);

		CloakRightClaws2 = new ModelRenderer(this);
		CloakRightClaws2.setRotationPoint(-6.25F, 23.5F, 0.0F);
		CloakRightLeg2.addChild(CloakRightClaws2);

		RightClawLayer4 = new ModelRenderer(this);
		RightClawLayer4.setRotationPoint(1.5F, -20.25F, -2.0F);
		CloakRightClaws2.addChild(RightClawLayer4);
		RightClawLayer4.setTextureOffset(4, 50).addBox(6.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightClawLayer4.setTextureOffset(4, 50).addBox(4.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightClawLayer4.setTextureOffset(4, 50).addBox(2.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		RightClawLayer5 = new ModelRenderer(this);
		RightClawLayer5.setRotationPoint(1.5F, -20.0F, -2.5F);
		CloakRightClaws2.addChild(RightClawLayer5);
		RightClawLayer5.setTextureOffset(4, 50).addBox(6.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightClawLayer5.setTextureOffset(4, 50).addBox(4.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightClawLayer5.setTextureOffset(4, 50).addBox(2.0F, 8.0F, -1.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(-5.25F, 18.25F, 2.25F);
		Cloak.addChild(Tail);
		Tail.setTextureOffset(58, 19).addBox(-2.5F, -9.75F, 1.25F, 5.0F, 5.0F, 1.0F, 0.0F, false);

		TailBone2 = new ModelRenderer(this);
		TailBone2.setRotationPoint(0.0F, 7.25F, -1.75F);
		Tail.addChild(TailBone2);
		TailBone2.setTextureOffset(0, 0).addBox(-2.0F, -16.5F, 4.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);

		TailBone3 = new ModelRenderer(this);
		TailBone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		TailBone2.addChild(TailBone3);
		TailBone3.setTextureOffset(22, 59).addBox(-1.5F, -15.75F, 5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		TailBone4 = new ModelRenderer(this);
		TailBone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		TailBone3.addChild(TailBone4);
		TailBone4.setTextureOffset(14, 59).addBox(-1.0F, -15.25F, 6.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		TailBone5 = new ModelRenderer(this);
		TailBone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		TailBone4.addChild(TailBone5);
		TailBone5.setTextureOffset(0, 19).addBox(-1.0F, -16.0F, 7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		TailBone5.setTextureOffset(33, 58).addBox(-1.5F, -16.5F, 8.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		TailBone6 = new ModelRenderer(this);
		TailBone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		TailBone5.addChild(TailBone6);
		TailBone6.setTextureOffset(30, 54).addBox(-1.5F, -17.0F, 9.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		TailBone7 = new ModelRenderer(this);
		TailBone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		TailBone6.addChild(TailBone7);
		TailBone7.setTextureOffset(56, 0).addBox(-2.5F, -18.0F, 10.0F, 5.0F, 3.0F, 2.0F, 0.0F, false);

		TailBone8 = new ModelRenderer(this);
		TailBone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		TailBone7.addChild(TailBone8);
		TailBone8.setTextureOffset(30, 0).addBox(-3.0F, -19.25F, 12.0F, 6.0F, 3.0F, 2.0F, 0.0F, false);

		TailBone9 = new ModelRenderer(this);
		TailBone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		TailBone8.addChild(TailBone9);
		TailBone9.setTextureOffset(22, 47).addBox(-3.5F, -21.75F, 13.0F, 7.0F, 4.0F, 3.0F, 0.0F, false);

		TailBone10 = new ModelRenderer(this);
		TailBone10.setRotationPoint(0.0F, 0.0F, 0.0F);
		TailBone9.addChild(TailBone10);
		TailBone10.setTextureOffset(44, 23).addBox(-2.5F, -23.5F, 14.5F, 5.0F, 5.0F, 4.0F, 0.0F, false);

		TailBone11 = new ModelRenderer(this);
		TailBone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		TailBone10.addChild(TailBone11);
		TailBone11.setTextureOffset(28, 19).addBox(-3.0F, -25.0F, 16.0F, 6.0F, 4.0F, 4.0F, 0.0F, false);

		TailBone12 = new ModelRenderer(this);
		TailBone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		TailBone11.addChild(TailBone12);
		TailBone12.setTextureOffset(50, 32).addBox(-2.0F, -27.25F, 18.5F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		TailBone13 = new ModelRenderer(this);
		TailBone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		TailBone12.addChild(TailBone13);
		TailBone13.setTextureOffset(16, 37).addBox(-1.5F, -28.5F, 20.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		TailBone14 = new ModelRenderer(this);
		TailBone14.setRotationPoint(0.0F, 0.0F, 0.0F);
		TailBone13.addChild(TailBone14);
		TailBone14.setTextureOffset(30, 5).addBox(-1.0F, -29.25F, 22.25F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		TailBone15 = new ModelRenderer(this);
		TailBone15.setRotationPoint(0.0F, 0.0F, 0.0F);
		TailBone14.addChild(TailBone15);
		TailBone15.setTextureOffset(5, 5).addBox(-0.5F, -29.75F, 23.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		NewOneTail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.CloakHead.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.CloakHead.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}