package com.saumeya.retailapp.domain.mock;

import com.saumeya.retailapp.model.CenterRepository;
import com.saumeya.retailapp.model.entities.Product;
import com.saumeya.retailapp.model.entities.ProductCategoryModel;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/*
 * This class serve as fake server and provides dummy product and category with real Image Urls taken from flipkart
 */
public class FakeWebServer {

    private static FakeWebServer fakeServer;

    public static FakeWebServer getFakeWebServer() {

        if (null == fakeServer) {
            fakeServer = new FakeWebServer();
        }
        return fakeServer;
    }

    void initiateFakeServer() {

        addCategory();

    }

    public void addCategory() {

        ArrayList<ProductCategoryModel> listOfCategory = new ArrayList<ProductCategoryModel>();

        listOfCategory
                .add(new ProductCategoryModel(
                        "Home Appliances",
                        "Home appliances Items",
                        "10%",
                        "http://www.butterflyindia.com/wp-content/themes/butterfly/images/kitchenappliances-img.png"));

        listOfCategory
                .add(new ProductCategoryModel(
                        "Electronics",
                        "Electronic Items",
                        "15%",
                        "http://daily-sun.com/assets/news_images/2017/03/21/electronic_devices-daily-sun.jpg"));

        CenterRepository.getCenterRepository().setListOfCategory(listOfCategory);
    }

    public void getAllElectronics() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> productlist = new ArrayList<Product>();

        // Ovens

        productlist
                .add(new Product(
                        "IFB 20 L Convection Microwave Oven (20SC2, Metallic Silver)",
                        "IFB 17PMMEC1 20 L Solo Microwave Oven",
                        "Stainless steel cavity and LED display with clock, 10 power levels and 10 temperature levels\n" +
                                "Grill, microwave and convection, Brand provides a starter kit with this product\n" +
                                "24 auto cook menus",
                        "19999",
                        "10",
                        "9999",
                        "10",
                        "https://rukminim1.flixcart.com/image/704/704/microwave-new/t/y/k/ifb-20sc2-original-imae4ty4cs24heas.jpeg?q=70",
                        "oven_1"));

        productlist
                .add(new Product(
                        " Samsung 23 L Solo Microwave Oven (MS23F301TAK/TL, Black) ",
                        "Samsung 1701MT 23 L Solo Microwave Oven",
                        "Cooking from fresh ingredients made simple\n" +
                                "Brand does NOT provide starter kit with this product\n" +
                                "Warranty : 1 year comprehensive warranty on product\n" +
                                "Enhance your kitchen look\n" +
                                "Cooked to perfection\n" +
                                "Keep it clean with ceramic\n" +
                                "L3",
                        "12000",
                        "10",
                        "8290",
                        "0",
                        "https://rukminim1.flixcart.com/image/704/704/microwave-new/v/f/q/samsung-ms23f301tak-tl-original-imaempg8aee59ych.jpeg?q=70",
                        "oven_2"));

        productlist
                .add(new Product(
                        "Morphy Richards 23 L Convection Microwave Oven (23MCG, Black)",
                        "Morphy Richards 23 L Convection grilled Microwave Oven",
                        "23 litres capacity and mirror glass door\n" +
                                "Varied convection cooking\n" +
                                "Brand does NOT provide starter kit with this product\n" +
                                "Warranty : 2 year comprehensive warranty on product\n" +
                                "Combination cooking (Convection, micro and grill)\n" +
                                "Stainless steel cavity and child lock\n" +
                                "10 auto cook options and 5 power levels\n" +
                                "Overheat and sensory protection\n" +
                                "Defrost function\n" +
                                "Warranty: 2 years on product\n" +
                                "Power Consumption: Microwave 1300 watts and Grill 1200 watts; Power output: 800 watts",
                        "15290",
                        "10",
                        "9290",
                        "0",
                        "https://rukminim1.flixcart.com/image/704/704/microwave-new/5/p/2/morphy-richard-23mcg-original-imadxecxzgqa3hbx.jpeg?q=70",
                        "oven_3"));

        productlist
                .add(new Product(
                        "Bajaj 20 L Grill Microwave Oven (2005 ETB, White)",
                        "Bajaj 25CG 20 L Convection Microwave Oven",
                        "Grill model and electronic control\n" +
                                "Auto defrost and digital timer\n" +
                                "Brand does NOT provide starter kit with this product\n" +
                                "Warranty : 1 year comprehensive warranty on product\n" +
                                "9 Auto cook menu and child safety lock\n" +
                                "Capacity: 20 liters",
                        "8300",
                        "12",
                        "6300",
                        "0",
                        "https://www.dealsbro.com/cache/bajaj-2005etb-1100x1100-imae4rsqvkhz44vh.jpeg",
                        "oven_4"));

        productlist
                .add(new Product(
                        "Whirlpool 20 L Convection Microwave Oven (Magicook 20BC, Black)",
                        "Whirlpool 20 L Convection Microwave Oven ",
                        "20 litre Capacity with 245mm Recessed Turntable: Optimum capacity for a family size of 3-4 people\n" +
                                " Now bake and roast with convection mode, cook delicious pizza, swiss roll, cheese cake and sponge cake\n" +
                                "Side swing door",
                        "10190",
                        "10",
                        "18790",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/y/k/m/ifb-25sc4-400x400-imaef2pztynvqjaf.jpeg",
                        "oven_5"));

        productMap.put("Microwave oven", productlist);

        ArrayList<Product> tvList = new ArrayList<Product>();

        // TV
        tvList.add(new Product(

                "Panasonic 108 cm (43 inches) super bright TH-43E460D Full HD LED TV",
                " super bright TH-43E460D Full HD LED TV",
                "Full HD (Resolution: 1920 x 1080), Refresh Rate: 200 hertz\n" +
                        "Audio: 35 W output\n" +
                        "Free standard wall mount attached with box\n" +
                        "Warranty Information: 1 year warranty provided by the manufacturer from date of purchase\n" +
                        "Installation: For requesting installation/wall mounting/demo of this product once delivered, please directly call Panasonic support on 18001031333 & 18001081333 and provide product's model name as well as seller's details mentioned on the invoice\n" +
                        "200Hz BMR\n" +
                        "Adaptive backlight dimming",
                "38999",
                "23",
                "11900",
                "0",
                "https://rukminim1.flixcart.com/image/704/704/television/u/6/e/panasonic-th-43ds630d-original-imaeqzqts22eg6er.jpeg?q=70",
                "tv_1"));

        tvList.add(new Product(
                "Samsung UA24K4100ARLXL 59 cm (24 inches)",
                "HD Ready LED TV (Black)",
                "HD Ready (Resolution 1366 x 768)\n" +
                        "Connectivity: HDMI*2, USB*2\n" +
                        "Special Features - Screen capture, Sound capture, Cinema Mode and Cricket Mode\n" +
                        "Installation: For requesting installation/wall mounting/demo of this product once delivered, please directly call Samsung support on 1800-3000-8282, 1800-266-8282 and provide product's model name as well as seller's details mentioned on the invoice\n" +
                        "Warranty Information: 1 year warranty provided by the manufacturer from date of purchase",
                "17000",
                "12",
                "13990",
                "0",
                "https://images-na.ssl-images-amazon.com/images/I/51G51v-HfLL._SX355_.jpg",
                "tv_2"));
        tvList.add(new Product(
                "Sanyo 80 cm (32 inches) XT-32S7200F",
                "Full HD LED TV (Black)",
                "Full HD (Resolution: 1920x1080), Refresh Rate: 60 hertz\n" +
                        "Connectivity - Input: 2*HDMI, 2*USB,\n" +
                        "Audio: 16 W output\n" +
                        "Warranty Information: 1 year warranty provided by the manufacturer from date of purchase\n" +
                        "Installation: For requesting installation/wall mounting/demo of this product once delivered, please directly call Sanyo support on 18004195088 and provide product's model name as well as seller's details mentioned on the invoice\n" +
                        "80cm/32-inch LED TV\n" +
                        "Audio: 8Wx2",
                "24990",
                "32",
                "18990",
                "0",
                "https://images-na.ssl-images-amazon.com/images/I/81hMYvOgn5L._SL1500_.jpg",
                "tv_3"));

        tvList.add(new Product(
                "Onida 123.19 cm (50 inches) LEO50FNAB2 ",
                "Full HD LED TV (Black/Blue)",
                "Full HD (Resolution: 1920 x 1080), Refresh Rate: 60 hertz\n" +
                        "Connectivity - Input: 2*HDMI, 2*USB, 1*VGA\n" +
                        "Audio: 26 W output\n" +
                        "Warranty Information: 1 year warranty provided by the manufacturer from date of purchase\n" +
                        "Installation: For requesting installation/wall mounting/demo of this product once delivered, please directly call Onida support on 1800-3000-9027 and provide product's model name as well as seller's details mentioned on the invoice\n" +
                        "Free standard wall mount included in box\n" +
                        "Easy Returns: This product is eligible for full refund within 10 days of delivery in case of any product defects, damage or features not matching the description provided",
                "50990",
                "24",
                "38990",
                "0",
                "http://img6a.flixcart.com/image/television/a/w/z/vu-32d6545-400x400-imaebagzbpzqhmxc.jpeg",
                "tv_4"));

        tvList.add(new Product(
                "LG 80 cm (32 inches) 32LJ523D HD",
                " IPS LED TV",
                "HD Ready (Resolution: 1366 x768)\n" +
                        "Connectivity - Input: 2*HDMI, 1*USB\n" +
                        "Audio: 20 W output\n" +
                        "Free standard wall mount provided at the time of installation\n" +
                        "Installation: For requesting installation/wall mounting/demo of this product once delivered, please directly call LG support on 18003159999 or 18001809999 and provide product's model name as well as seller's details mentioned on the invoice\n" +
                        "Life-like color - IPS offers a color impression that is most identical to that of the original image and the colors are truly closest to nature and most comfortable for the eyes\n" +
                        "Wide Viewing Angle: Among LCD panels, it is visibly clear that IPS shows the most consistent color and contrast from all angles - free from color wash and contrast loss, it is the ideal panel for all purposes",
                "24490",
                "27",
                "17998",
                "0",
                "https://images-na.ssl-images-amazon.com/images/I/51upA-YqYIL._SX355_.jpg",
                "tv_5"));

        productMap.put("Television", tvList);

        productlist = new ArrayList<Product>();

        // Washing Machine
        productlist
                .add(new Product(
                        "LG 6.2 kg Fully-Automatic Top Loading Washing Machine  ",
                        "(T7269NDDL, Blue and White)",
                        "Fully-automatic top-loading washing machine; 6.2kg\n" +
                                "Warranty: 2 years warranty on product and 10 years on motor\n" +
                                "Sapience or spirit look\n" +
                                "Smart inverter motor, 3 smart motions with 36 percent more energy savings\n" +
                                "Smart diagnosis\n" +
                                "Turbo drum\n" +
                                "36 percent energy savings",
                        "17590",
                        "15",
                        "12998",
                        "0",
                        "http://top10wala.in/wp-content/uploads/2015/10/LG-T72CMG22P-6.2-kg-Fully-Automatic-Top-Loading-Washing-Machine.jpeg",
                        "v_cleaner_1"));

        productlist
                .add(new Product(
                        "Godrej 6.4 kg Fully-Automatic Top Loading Washing Machine  ",
                        "WTA 640 EI, Autumn Red",
                        " Fully-automatic top-loading washing machine; 6.4 kg\n" +
                                "5 wash programs\n" +
                                "Warranty: 10 year wash motor warranty\n" +
                                "Auto restart with memory back up\n" +
                                "i-Wash technology\n" +
                                "Dry tap protection\n" +
                                "4 water levels",
                        "18990",
                        "20",
                        "14998",
                        "0",
                        "https://www.compareprix.in/images/product/large/godrej-eon-wta-640-ei-6-4-kg-fully-automatic-top-loading-washing-machine-large.jpg",
                        "v_cleaner_2"));

        productlist
                .add(new Product(
                        "Samsung 6.2 kg Fully-Automatic Top load Washing Machine",
                        "WA62M4100HY/TL, Imperial Silver",
                        "Installation: For requesting an installation/demo for this product once delivered, please call Samsung support directly on 1800 40 7267864 and provide the product's model name.\n" +
                                "Fully-automatic top load washing machine; 6.2 kg\n" +
                                "Warranty: 2 years comprehensive warranty on product\n" +
                                "Design - door, color - PM grey, panel display - red LED\n" +
                                "Feature - air turbo, auto restart, child lock, magic filter, tempered glass window, drum type - diamond drum, pulsator- center jet, water level - 5 levels\n" +
                                "Cycle - blanket, delicates, eco tub clean, additional cycle - normal, quick wash, soak plus normal, number of cycle - 6\n" +
                                "Physical specification - voltage/frequency- 220/50, drum material- SS",
                        "15049",
                        "15",
                        "13298",
                        "0",
                        "http://image3.mouthshut.com/images/imagesp/925769529s.jpeg",
                        "v_cleaner_3"));

        productlist
                .add(new Product(
                        "Whirlpool 6.2 kg Fully-Automatic Top Loading Washing Machine  ",
                        "(Whitemagic Classic 621S, Grey)",
                        "Fully-automatic top-loading washing machine; 6.2 kg\n" +
                                "Warranty: 2 Years comprehensive warranty\n" +
                                "Spa Wash System\n" +
                                "ZPF Technology\n" +
                                "4 Wash Programs\n" +
                                "Agipeller with Spa Drum\n" +
                                "Steel Drum",
                        "15750",
                        "16",
                        "13298",
                        "0",
                        "https://n4.sdlcdn.com/imgs/a/1/l/Whirlpool-6-2-Kg-DC62-SDL662885865-1-293f2.jpg",
                        "v_cleaner_4"));

        productlist
                .add(new Product(
                        "Intex 6.0 kg Fully-Automatic Front Loading Washing Machine (WMFF60BD, White)",
                        "WMFF60BD, White",
                        "Fully-automatic front-loading washing machine 6.0 kg\n" +
                                "16 wash programs\n" +
                                "PCM metal body\n" +
                                "Warranty: 2 years warranty on product\n" +
                                "SS smooth curve designer tub\n" +
                                "Big digital display\n" +
                                "Temperature selection\n" +
                                "Spin speed selection",
                        "23490",
                        "36",
                        "14998",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/81vlrwHjtJL._SY445_.jpg",
                        "v_cleaner_5"));

        productMap.put("Washing Machine", productlist);


        CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

    }

    public void getAllFurnitures() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> productlist = new ArrayList<Product>();

        // laptops
        productlist
                .add(new Product(
                        " Lenovo Ideapad 320E",
                        "Lenovo Ideapad 320E 80XH01GKIN 15.6-inch Laptop",
                        "2GHz Intel Core i3-6006U 6th Gen processor\n" +
                                "4GB DDR4 RAM\n" +
                                "1TB 5400rpm Serial ATA hard drive\n" +
                                "15.6-inch screen, Integrated Graphics\n" +
                                "FreeDOS operating system\n" +
                                "2.2kg laptop\n" +
                                "HD 720p webcam with single mic\n" +
                                "1 year warranty from manufacturer from date of purchase",
                        "27490",
                        "2",
                        "26990",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/61Uqlef9Z0L._SX355_.jpg",
                        "table_1"));

        productlist
                .add(new Product(
                        " Apple MacBook Air MQD32HN/A 13.3-inch Laptop 2017",
                        "Apple MacBook Air MQD32HN/A 13.3-inch Laptop 2017 (Core i5/8GB/128GB/MacOS Sierra/Integrated Graphics)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "77200",
                        "29",
                        "54699",
                        "0",
                        "https://m.media-amazon.com/images/S/aplus-media/sota/44654e62-58f5-4295-8954-75270f8ccf6f._SR300,300_.png",
                        "table_2"));

        productlist
                .add(new Product(
                        " HP 15q-BU004TU 2017 15.6-inch Laptop, Grey",
                        "HP 15q-BU004TU 2017 15.6-inch Laptop (6th Gen Core i3-6006U/4GB/1TB/Free DOS/Integrated Graphics), Grey",
                        "2GHz Intel Core i3-6006U 6th Gen processor\n" +
                                "4GB DDR4 RAM\n" +
                                "1TB 5400rpm Serial ATA hard drive\n" +
                                "15.6-inch screen, Integrated Graphics\n" +
                                "Free DOS operating system\n" +
                                "4 hours battery life, 2.1kg laptop\n" +
                                "Unique visual Strata pattern design on keyboard cover with chrome finished hinges",
                        "31837",
                        "18",
                        "25990",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/7167j7J3fPL._SX355_.jpg",
                        "table_3"));

        productlist
                .add(new Product(
                        " Acer Switch 10E SW3-016 10.1-inch Laptop",
                        "Acer Switch 10E SW3-016 10.1-inch Laptop (Atom x5-Z8300/2GB/32GB/Windows 10 Home/Integrated Graphics), Shark Grey",
                        "1.44GHz Intel Atom x5-Z8300 processor\n" +
                                "2GB DDR3L RAM\n" +
                                "32GB flash storage\n" +
                                "10.1-inch screen, Intel HD Graphics\n" +
                                "Windows 10 Home operating system\n" +
                                "12 hours battery life, 1.2kg laptop\n" +
                                "Versatile shape-shifter",
                        "15990",
                        "19",
                        "12999",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/817tmUUab0L._SX355_.jpg",
                        "table_4"));

        productlist
                .add(new Product(
                        " Dell Vostro 3468 14-inch Laptop",
                        "Dell Vostro 3468 14-inch Laptop (7th Gen i3/4GB/1TB/Windows 10/Integrated Graphics), Black with Pre-loaded with MS Office",
                        "2.4GHz Intel i3 - 7100U 7th Gen processor\n" +
                                "4GB DDR4 RAM\n" +
                                "1TB 5400rpm Serial ATA hard drive\n" +
                                "14-inch screen, Intel HD Graphics\n" +
                                "Windows 10 operating system\n" +
                                "VGA+HDMI connectivity option - Only notebook in the range with this option\n" +
                                "Anti glare display",
                        "35925",
                        "3",
                        "34990",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/61c6CK6RX2L._SX355_.jpg",
                        "table_5"));

        productMap.put("Laptops", productlist);

        productlist = new ArrayList<Product>();

        // Tablets
        productlist
                .add(new Product(
                        "Apple iPad Tablet , Space Grey",
                        "9.7 inch, 32GB, Wi-Fi",
                        "8MP primary camera with auto focus, panorama, HDR, exposure control, burst mode, tap to focus, timer mode, f/2.4 aperture, five-element lens, hybrid IR flter, backside illumination, auto image stabilisation, face detection, photo geotagging, video image stabilisation, slow motion (120 fps), 3X video zoom, video geotagging and 1.2MP front facing camera\n" +
                                "9.7-inch (24.64 centimeters) LED Backlit Display with IPS Technology, Fingerprint-resistant Oleophobic Coating with 2048 x 1536 pixels resolution and 264 ppi pixel density\n" +
                                "IOS v10 operating system with A9 Chip with 64-bit Architecture with Embedded M9 Co-processor processor, 32GB internal memory\n" +
                                "32.4-watt-hour lithium-polymer battery",
                        "28900",
                        "15",
                        "24680",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/61fZRJBhx9L._SX355_.jpg",
                        "chair_1"));

        productlist
                .add(new Product(
                        "Lenovo Tab3 730X Tablet Black Blue",
                        "7 inch, 1GBRAM, 16GB, Wi-Fi + 4G LTE, Voice Calling",
                        "5MP primary camera with focus, fixed focus and 2MP front facing camera\n" +
                                "17.78 centimeters (7-inch) IPS capacitive touchscreen with 1024 x 600 pixels resolution\n" +
                                "Android v6.0 Marshmallow operating system with 1GHz 64-bit MediaTek quad core processor, 1GB RAM, 16GB internal memory and dual SIM (micro+micro) dual-standby (4G+4G)\n" +
                                "3450mAH lithium-ion battery\n" +
                                "1 year manufacturer warranty for device and 6 months manufacturer warranty for in-box accessories including batteries from the date of purchase",
                        "11000",
                        "27",
                        "7999",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/610%2BEpGFJcL._SY445_.jpg",
                        "chair_2"));

        productlist
                .add(new Product(
                        "Samsung Tab A SM-T355YZWA Tablet,Sandy White",
                        "8 inch, 16GB, Wi-Fi+LTE+Voice Calling",
                        "5MP primary camera with autofocus,2 MP front facing camera\n" +
                                "8.0 inch,TFT capacitive touchscreen, 16M colors,768 x 1024 pixels resolution\n" +
                                "OS-Android OS, v5.0 (Lollipop),Quad-core 1.2 GHz,16 GB, 2 GB RAM (LTE)\n" +
                                "Non-removable Li-Ion 4200 mAh battery\n" +
                                "1 year manufacturer warranty for device and 6 months manufacturer warranty for in-box accessories including batteries from the date of purchase",
                        "17900",
                        "16",
                        "16500",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/31KskWzXp7L.jpg",
                        "chair_3"));

        productlist
                .add(new Product(
                        "Micromax Canvas Tab P681 Tablet, Blue",
                        "8 inch, 16GB, Wi-Fi + 3G + Voice Calling",
                        "5MP primary camera with auto focus, flash and 2MP front facing camera\n" +
                                "20.32 centimeters (8-inch) IPS capacitive touch screen with 1280 x 800 pixels resolution\n" +
                                "Android v6 Marshmallow operating system with 1.3GHz Mediatek MT8321 quad core processor, 1GB RAM, 16GB internal memory expandable up to 32GB and dual SIM (micro+micro) dual-standby (3G+3G)\n" +
                                "4000mAH lithium polymer battery\n" +
                                "1 year manufacturer warranty for device and 6 months manufacturer warranty for in-box accessories including batteries from the date of purchase",
                        "7999",
                        "28",
                        "5799",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/61rATHDHxwL._SY445_.jpg",
                        "chair_4"));

        productlist
                .add(new Product(
                        "iBall D7061 Tablet, Charcoal Blue",
                        "7 inch, 8GB, Wi-Fi+3G+Voice Calling",
                        "Design and Display \\ Full Capacitive Multi-Touch \\ 17.78cm (7\") \\ HD screen resolution (1024*600)\n" +
                                "Battery \\ 2500mAh Battery, Music & Video \\ Music Player with MP3 and other popular formats support \\ HD Video playback and other popular formats support \\ Wire free FM Radio, Connectivity \\ Wi-Fi 802.11 b\\g\\n \\ Micro USB Port \\ Bluetooth 4.0 \\ USB OTG Function \\ USB Tethering and USB Internet\n" +
                                "Processor \\ ARM Cortex A7 1.3 GHz Dual core processor, Camera \\ 2.0 MP Rear camera with LED Flash \\ Front camera for video calling \\ Pre-loaded camera features: Panaroma, Face beauty, Live photo, Voice capture, Face detection, Smile shot, HDR, Self-timer, Zero shutter delay\n" +
                                "Memory & Storage \\ 512MB RAM \\ 8GB Built-in storage (Approx. 6GB of built-in storage is used by OS and application files) \\ Micro SD Slot, expandable up to 32GB\n" +
                                "Operating System \\ Android 4.4 KitKat, 2G Network \\ Dual SIM, Dual Stand-by \\ Dual-band Support 900/1800 MHz \\ Phone Calling Function with built-in earpiece receiver",
                        "4599",
                        "28",
                        "3590",
                        "0",
                        "https://images-eu.ssl-images-amazon.com/images/I/41ANNjgdOoL._SL500_AC_SS350_.jpg",
                        "chair_5"));


        productMap.put("Tablets", productlist);

        productlist = new ArrayList<Product>();

        // Phones
        productlist
                .add(new Product(
                        "Lenovo Z2 Plus (Black)",
                        "Lenovo Z2 Plus (Black)",
                        "Qualcomm Snapdragon 820, 4 custom Kryo cores, 2.15Ghz, 14nm FinFET process, 4GB DDR4 RAM, 64GB SmartSLC internal memory, Dual SIM (nano+nano), VoLTE & 4G+\n" +
                                "Android v6.0.1 with Google Now launcher, 3500mAh high density Li-Ion Battery\n" +
                                "13MP large pixel (1.34µm) primary camera with Hybrid autofocus (PDAF&CAF), 4K video recording, slow-motion capture (120fps), Time-lapse, Live Filters, Auto HDR. 8MP Front facing Camera with large pixel (1.4µm)\n" +
                                "12.7 centimeters (5-inch) LTPS LCD capacitive touchscreen with 1920 x 1080 pixels resolution and 441 ppi pixel density\n" +
                                "Matte Black Stealth Case available in the box\n" +
                                "1 year manufacturer warranty for device and 6 months manufacturer warranty for in-box accessories including batteries from the date of purchase",
                        "19999",
                        "48",
                        "10499",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/71nAMPMPXEL._SL1076_.jpg",
                        "almirah_1"));

        productlist
                .add(new Product(
                        "Honor 8 (Sapphire Blue, 4GB RAM + 32 GB Memory)",
                        "Honor 8 (Sapphire Blue, 4GB RAM + 32 GB Memory)",
                        "12MP dual primary camera and 8MP front facing camera\n" +
                                "13.2 centimeters (5.2-inch) LTPS capacitive touchscreen with 1920 x 1080 pixels resolution, 423 ppi pixel density and 16M color support\n" +
                                "Android v6.0 Marshmallow operating system with 4 x 2.3GHz ARM Cortex-A72 + 4 x 1.8GHz ARM Cortex-A53 Hisilicon Kirin 950 octa core processor, 4GB RAM, 32GB internal memory expandable up to 128GB, Single nano SIM (4G)\n" +
                                "3000mAH lithium-ion battery providing talk-time of up to 21 hours on 2G, 17.5 hours on 3G networks and standby time of up to 380 hours on 3G, 390 hours on 4G networks\n" +
                                "1 year manufacturer's warranty for the device, Battery / Adapter comes with pack of 6 months Warranty and 3 months for Data/USB Cable.",
                        "29999",
                        "38",
                        "18639",
                        "0",
                        "https://cdn2.gsmarena.com/vv/bigpic/huawei-honor-8-pro.jpg",
                        "almirah_2"));

        productlist
                .add(new Product(
                        "Samsung Galaxy J7 Prime Black (16GB)",
                        "Samsung Galaxy J7 Prime Black (16GB)",
                        "13MP f1.9 primary camera and 8MP f1.9 front facing camera\n" +
                                "13.97 centimeters (5.5-inch) TFT capacitive touchscreen with 1080 x 1920 pixels FHD display with metal unibody and fingerprint sensor\n" +
                                "Android v6.0 Marshmallow operating system with Exynos octa core processor, 3GB RAM, 16GB internal memory expandable up to 256GB and dual SIM\n" +
                                "3300mAH lithium-ion battery\n" +
                                "1 year manufacturer warranty for device and 6 months manufacturer warranty for in-box accessories including batteries from the date of purchase\n" +
                                "GPS: Yes, with A-GPS, GLONASS/ BDS (region dependent)",
                        "16900",
                        "30",
                        "11890",
                        "0",
                        "https://dzvfs5sz5rprz.cloudfront.net/media/catalog/product/cache/1/image/1200x/9df78eab33525d08d6e5fb8d27136e95/s/a/samsung_galaxy_j7_prime_black_9999.jpg",
                        "almirah_3"));

        productlist
                .add(new Product(
                        "Apple iPhone 6 (Space Grey, 32GB)",
                        "Apple iPhone 6 (Space Grey, 32GB)",
                        "8MP primary camera with auto focus and 1.2MP front facing camera\n" +
                                "11.4 centimeters (4.7-inch) retina HD touchscreen with 1334 x 750 pixels resolution and 326 ppi pixel density\n" +
                                "iOS 8, upgradable to iOS 10.3.2 with 1.4GHz A8 chip 64-bit architecture processor, 1GB RAM, 32GB internal memory and single nano SIM\n" +
                                "1810mAH lithium-ion battery providing talk-time of 14 hours on 3G networks and standby time of 240 hours\n" +
                                "1 year manufacturer warranty for device and manufacturer warranty for in-box accessories including batteries from the date of purchase",
                        "29500",
                        "12",
                        "25980",
                        "0",
                        "https://i.gadgets360cdn.com/large/iphone_6_full_1489986905312.jpg?output-quality=80",
                        "almirah_4"));

        productlist
                .add(new Product(
                        "Sony Xperia XA Dual (Graphite Black)",
                        "Sony Xperia XA Dual (Graphite Black)",
                        "13MP primary camera with hybrid auto focus and 8MP front facing camera for low light selfies\n" +
                                "12.7 centimeters (5-inch) HD capacitive touchscreen with 1280 x 720 pixels resolution, edge to edge design and mobile BRAVIA engine 2\n" +
                                "Android v6.0.1 Marshmallow operating system with 2GHz MediaTek Helio octa core processor, 2GB RAM, 16GB internal memory expandable up to 200GB and dual SIM (nano+nano) dual-standby (4G+2G)\n" +
                                "2300mAH lithium-ion battery upto 2 days life with stamina mode\n" +
                                "1 year manufacturer warranty for device and 6 months manufacturer warranty for in-box accessories including batteries from the date of purchase",
                        "18990",
                        "35",
                        "12384",
                        "0",
                        "https://cdn2.from.ae/media/catalog/product/cache/image/9df78eab33525d08d6e5fb8d27136e95/0/1/01_114_82.jpg",
                        "almirah_5"));


        productMap.put("Phones", productlist);
        productlist = new ArrayList<Product>();

        // desktop and monitors
        productlist
                .add(new Product(
                        " Samsung LC24F390FHWXXL 23.6-inch Curved LED Monitor (Black)",
                        "Samsung LC24F390FHWXXL 23.6-inch Curved LED Monitor (Black)",
                        "1800R curvature for an immersive viewing experience\n" +
                                "Glossy black, ultra-slim design\n" +
                                "AMD FreeSync and Game Mode\n" +
                                "Eco-friendly with power saving",
                        "13500",
                        "8",
                        "12380",
                        "0",
                        "http://images.samsung.com/is/image/samsung/in-curved-cf390-lc24f390fhwxxl-019-dynamic-black?$PD_GALLERY_JPG$",
                        "table_1"));

        productlist
                .add(new Product(
                        " LG IPS 20MP48HB 20-inch Monitor (Black)",
                        "LG IPS 20MP48HB 20-inch Monitor (Black)",
                        "IPS screen\n" +
                                "178/178 viewing angle\n" +
                                "On screen control\n" +
                                "Reader mode (for reducing Eye Fatigue)\n" +
                                "Flicker safe\n" +
                                "Vesa wall mount (100 x 100)",
                        "7800",
                        "18",
                        "6410",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/41kwU46PKAL._SX355_.jpg",
                        "table_2"));

        productlist
                .add(new Product(
                        " Dell E2216HV 21.5-inch Full HD LED Monitor (Black)",
                        "Dell E2216HV 21.5-inch Full HD LED Monitor (Black)",
                        "21.5 inch TN-panel display\n" +
                                "Great display quality at multiple angles with VESA-mount compatibility and tilt options, as well as a VGA and display port\n" +
                                "Uncompromising quality testing standards with 3-year warranty and service ensure long-term performance\n" +
                                "Save energy with power-efficient features\n" +
                                "Aspect ratio: 16:9\n" +
                                "Tilt adjustable with WLED backlight\n" +
                                "Color support: 16.7 million colors\n" +
                                "Display screen coating: Anti-glare with 3H hardness",
                        "11628",
                        "25",
                        "8690",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/814FWB9zXNL._SX355_.jpg",
                        "table_3"));

        productlist
                .add(new Product(
                        " Thinvent Micro 4 2017 Mini PC (Cortex/1GB/8GB/Thinux/Integrated Graphics), Black",
                        "Thinvent Micro 4 2017 Mini PC",
                        "1.3GHz ARM Cortex processor\n" +
                                "1GB DDR3 RAM\n" +
                                "8GB hard drive\n" +
                                "Thinux operating system\n" +
                                "Intigrated Graphics",
                        "5000",
                        "24",
                        "3754",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/81gMfWqiWCL._SX355_.jpg",
                        "table_4"));

        productlist
                .add(new Product(
                        " Lappymaster (17.3) Inches LED Monitor (Black)",
                        "Lappymaster (17.3) Inches LED Monitor (Black)",
                        "Customer service Support 18001039635 (Toll free)\n" +
                                "Service Point at more then 280+ locations\n" +
                                "1 Year Warranty\n" +
                                "Lappymaster Monitor It has a glossy finish that is in tandem with the functionality of this screen",
                        "4999",
                        "26",
                        "3699",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/81YCupxq6iL._SX355_.jpg",
                        "tables_5"));

        productMap.put("Desktop Monitors", productlist);

        productlist = new ArrayList<Product>();

        //Accessories
        productlist
                .add(new Product(
                        " Intex IT-PB 10K 10000mAH Power Bank (White)",
                        "Intex IT-PB 10K 10000mAH Power Bank (White)",
                        "Capacity: 10000mAH\n" +
                                "USB ports 3 numbers\n" +
                                "Plug and Play\n" +
                                "Built in Battery\n" +
                                "Product designed for Mobile, MP3/MP4 ,Tablets and Digicam\n" +
                                "Life Cycle greater than 500 times\n" +
                                "1 year warranty provided by the manufacturer from date of purchase",
                        "1599",
                        "44",
                        "899",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/31zKLUfqWoL._AC_UL320_SR180,320_.jpg",
                        "table_1"));

        productlist
                .add(new Product(
                        " AmazonBasics 4.0 Amp Dual USB Car Charger for Apple and Android Devices - Black",
                        "AmazonBasics 4.0 Amp Dual USB Car Charger for Apple and Android Devices - Black",
                        "Two-port 20 watt USB car charger for charging up to two devices at a time-great for phones, tablets, and other devices\n" +
                                "Compatible with iPhone iPhone 7 Plus / 7 / 6s Plus / 6s / 6 Plus / Galaxy S7 / S6 / Edge / Plus / iPad Pro / iPad Air / Air 2 / iPad mini / LG, Nexus, HTC and more\n" +
                                "Built-in safety system that includes overload, short circuit and surge protection\n" +
                                "Discrete and non-distracting blue LED to confirm connection\n" +
                                "Lightweight and compact for convenient portability; charging cable not included\n" +
                                "1 year limited warranty",
                        "795",
                        "25",
                        "599",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/61fogsshKdL._SY355_.jpg",
                        "table_2"));

        productlist
                .add(new Product(
                        " Skullcandy S2IKDY-003 In-Ear Headphone With Mic (Black) (by BLUTECH)",
                        "Skullcandy S2IKDY-003 In-Ear Headphone With Mic (Black) (by BLUTECH)",
                        "11 millimeters drivers with neodymium magnets for full-range sound\n" +
                                "Two sizes of silicone gel earbud sleeves for a perfect fit\n" +
                                "1.3 meter nylon braided cable with gold-plated 3.5 millimeters plug\n" +
                                "In-ear design allows for passive noise isolation",
                        "2999",
                        "77",
                        "699",
                        "0",
                        "https://n4.sdlcdn.com/imgs/a/i/g/Skullcandy-INKD-S2IKDY-003-Black-1669524-3-82008.jpg",
                        "table_3"));

        productlist
                .add(new Product(
                        " Mi band HRX Edition (Black)",
                        "Mi band HRX Edition (Black)",
                        "Devices with Android 4.4, iOS 7.0 or above with Bluetooth 4.0 support compatible phones : Devices with Android 4.4 and above, such as Mi 3, Mi 4, Mi 4i, Mi 5, Mi Max, Redmi Note 4G, Redmi Note Prime, Redmi 1S, Redmi 2, Redmi 2 Prime, Redmi Note 3, Redmi 3S, Redmi 3S Prime, Redmi 3S+, devices with iOS 7.0 and above, such as iPhone models 4s and later.Note: Mi Band's phone unlocking feature requires smartphones with MIUI or Android 5.0 and above.\n" +
                                "HRX Engraved Band - Limited Edition\n" +
                                "Call & Notification Alerts from applications such as UBER and WhatsApp\n" +
                                "IP67- Water resistant upto 30mins under 1m water\n" +
                                "Total length: 235mm, Adjustable length: 155-210mm ,Material: Thermoplastic elastomer, aluminum alloy\n" +
                                "0.42\" OLED display Bluetooth 4.0 BLE\n" +
                                "Standby time: 23 days\n" +
                                "Battery type: Lithium polymer",
                        "1799",
                        "28",
                        "1299",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/61niuKaAEZL._SY450_.jpg",
                        "table_4"));

        productlist
                .add(new Product(
                        " SanDisk Ultra MicroSDHC 16GB UHS-I Class 10 Memory Card (Upto 80 MB/s Speed),with adapter",
                        "SanDisk Ultra MicroSDHC 16GB UHS-I Class 10 Memory Card",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "725",
                        "41",
                        "429",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/81HlYrG-uCL._SX355_.jpg",
                        "table_5"));

        productMap.put("Accessories", productlist);

        productlist = new ArrayList<Product>();



        CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

    }

    public void getAllProducts(int productCategory) {

        if (productCategory == 0) {

            getAllElectronics();
        } else {

            getAllFurnitures();

        }

    }

}
