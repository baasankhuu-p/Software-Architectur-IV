public static void main(String[] args) {
    while (1 != 0) {
        int val;
        System.out.println("==================================================== START ============================================");
        System.out.print("1. Үйлчлүүлэгч нэмэх 2. Үйлчлүүлэгчидийн мэдээллийг харах 3. Үйлчлүүлэгч хасах 4. Үйлчлэгчийн мэдээлэл харах 5. Үйлчлүүлэгчийн мэдээллийг засах \n6. Нийт хумсны зураг 7. Зурагийн сан цэвэрлэх 8. Exit\nINPUT: ");
        val = sc.nextInt();
        switch (val) {
            case 1: {
                AddCustomer(new Customer());
            }
            case 2: {
                ShowAll();
            }
            break;
            case 3: {
                String name;
                System.out.print("Нэрээ оруулна уу: ");
                name = sc.next();
                MAPCustomInfo.remove(name);
            }
            break;
            case 4: {
                String name;
                System.out.print("Нэрээ оруулна уу: ");
                name = sc.next();
                System.out.println("Дуртай зураг: " + MAPCustomInfo.get(name));
            }
            break;
            case 5: {
                String name;
                int edit;
                System.out.print("Нэрээ оруулна уу: ");
                name = sc.next();
                System.out.println("1. Зураг нэмэх 2. Зураг устгах");
                edit = sc.nextInt();
                String Image, images;
                System.out.print("Зурагны нэр: ");
                Image = sc.next();
                switch (edit) {
                    case 1: {
                        for (Map.Entry<String, String> mEntry : MAPCustomInfo.entrySet()) {
                            if (mEntry.getKey().equals(name)) {
                                images = mEntry.getValue().toString();
                                images.replace(Image + " ", " ");
                                images += Image + " ";
                                AddImage(Image);
                                mEntry.setValue(images);
                                System.out.println(mEntry.getKey() + "<=>" + mEntry.getValue());
                            }
                        }
                    }
                    break;
                    case 2: {
                        for (Map.Entry mEntry : MAPCustomInfo.entrySet()) {
                            if (mEntry.getKey().equals(name)) {
                                images = mEntry.getValue().toString();
                                images.replace(Image + " ", "");
                                mEntry.setValue(images);
                                System.out.println(mEntry.getKey() + "<=>" + mEntry.getValue());
                            }
                        }
                    }
                    break;
                }

            }
            break;
            case 6: {
                System.out.println("Image: " + STKimage);
            }
            break;
            case 7: {
                clearAllImage();
            }
            break;
            case 8:
                System.out.println("==================================================== END ============================================");
                System.exit(0);
                break;
        }
    }
}
