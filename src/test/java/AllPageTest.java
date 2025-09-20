import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;



    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    public class AllPageTest extends BaseStep {

        @Test
        @Order(1)
        public void openDriver() {
            LogTest.info("Driver açılıyor");
            BaseStep.openChromeDriver();
        }

        @Test
        @Order(2)
        @DisplayName("Tarayıcıyı Aç")
        public void loginUser() {
            LogTest.info("opened Driver");
            LogTest.info("finding Input");
            WebElement usernameInput = BaseStep.findElementXpathWithWait("/html/body/div/div/div[2]/div[2]/div[1]/form/div[1]/div/input", TimeOut.LONG.value);
            BaseStep.clearAndType(usernameInput, "admin@gatexpress.com", "Kullanıcı adı");
            LogTest.info("send text");
            WebElement passwordInput = BaseStep.findElementXpathWithWait("/html/body/div/div/div[2]/div[2]/div[1]/form/div[2]/div/input", TimeOut.LONG.value);
            BaseStep.clearAndType(passwordInput, "Admin123!", "şifre");
            LogTest.info("şifre gönderiliyor");
            WebElement buttonInput = BaseStep.findElementXpathWithWait("/html/body/div/div/div[2]/div[2]/div[1]/form/button/div", TimeOut.LONG.value);
            BaseStep.clickElement(buttonInput, "Giriş yap butonu");

        }

        @Test
        @Order(3)
        @DisplayName("Dashboard sayfası_1.Kart_Ülkeleri Görüntüle")
        public void dashboardPage() throws InterruptedException {
            LogTest.info("Dashboard - Ülkeleri Görüntüle butonu");
            WebElement ulkeImportButton = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div[1]/div/a[1]", TimeOut.LONG.value);
            LogTest.info("Ülkeleri görünütle butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(ulkeImportButton, "Ülke Yönetimi sayfası");
            Thread.sleep(500);
            LogTest.info("Ülke Yönetimi sayfası açıldı");
            //BaseStep.navigateToUrl("https://test.gatexpress.com/admin");
            WebElement dashboard = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/nav/a[1]", TimeOut.LONG.value);
            BaseStep.clickElement(dashboard, "Dashboard sayfasına dönüldü");
            LogTest.info("Admin sayfasına geri dönüldü");
        }

        @Test
        @Order(4)
        @DisplayName("Dashboard sayfası_1.Kart_Yeni Ülke Import et")
        public void YeniülkeImport() throws InterruptedException {
            LogTest.info("Dashboard -Yeni Ülke import butonu");
            WebElement ulkeImport = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div[1]/div/a[2]", TimeOut.LONG.value);
            LogTest.info("Yeni Ülke import butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(ulkeImport, "Yeni Ülke import sayfası");
            Thread.sleep(500);
            LogTest.info("Yeni ülke Import sayfası açıldı");
            //BaseStep.navigateToUrl("https://test.gatexpress.com/admin");
            WebElement dashboard = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/nav/a[1]", TimeOut.LONG.value);
            BaseStep.clickElement(dashboard, "Dashboard sayfasına dönüldü");
            LogTest.info("Admin sayfasına geri dönüldü");
        }

        @Test
        @Order(5)
        @DisplayName("Dashboard sayfası_2.Kart_Shipping Rates Listesi")
        public void ShippingRates() throws InterruptedException {
            LogTest.info("SDashboard - Shipping Rates Listesi butonu");
            WebElement ShippingRates = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div[2]/div/a[1]", TimeOut.LONG.value);
            LogTest.info("Shipping Rates listesi butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(ShippingRates, "Shipping Rates sayfası");
            Thread.sleep(500);
            LogTest.info("Shipping Rates sayfası açıldı");
            //BaseStep.navigateToUrl("https://test.gatexpress.com/admin");
            WebElement dashboard = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/nav/a[1]", TimeOut.LONG.value);
            BaseStep.clickElement(dashboard, "Dashboard sayfasına dönüldü");
            LogTest.info("Admin sayfasına geri dönüldü");
        }

        @Test
        @Order(6)
        @DisplayName("Dashboard sayfası_2.Kart_Excel Import Et")
        public void ShippingRatesImport() throws InterruptedException {
            LogTest.info("Dashboard - Excel Import butonu");
            WebElement ShippingRates = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div[2]/div/a[2]", TimeOut.LONG.value);
            LogTest.info("Excel Import Et butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(ShippingRates, "Shipping Rates Import sayfası");
            Thread.sleep(500);
            LogTest.info("Shipping Rates Import sayfası açıldı");
            //BaseStep.navigateToUrl("https://test.gatexpress.com/admin");
            WebElement dashboard = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/nav/a[1]", TimeOut.LONG.value);
            BaseStep.clickElement(dashboard, "Dashboard sayfasına dönüldü");
            LogTest.info("Admin sayfasına geri dönüldü");
        }

        @Test
        @Order(7)
        @DisplayName("Dashboard sayfası_3.Kart_Konfigürasyon Listesi")
        public void KargoKonfigürasyon() throws InterruptedException {
            LogTest.info("Dashboard-Konfigürasyon Listesi");
            WebElement kargoAyarlari = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div[3]/div/a[1]", TimeOut.LONG.value);
            LogTest.info("Konfigürasyon Listesi butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(kargoAyarlari, "Kargo Ayarları sayfası");
            Thread.sleep(500);
            LogTest.info("Kargo Ayarları sayfası açıldı");
            //BaseStep.navigateToUrl("https://test.gatexpress.com/admin");
            WebElement dashboard = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/nav/a[1]", TimeOut.LONG.value);
            BaseStep.clickElement(dashboard, "Dashboard sayfasına dönüldü");
            LogTest.info("Admin sayfasına geri dönüldü");
        }

        @Test
        @Order(8)
        @DisplayName("Dashboard sayfası_3.Kart_Formül Editörü")
        public void kargoFormülEditörü() throws InterruptedException {
            LogTest.info("Dashboard - Formül Editörü butonu");
            WebElement kargoAyarlari = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div[3]/div/a[2]", TimeOut.LONG.value);
            LogTest.info("Formül Editörü butonuna tıkla");
            Thread.sleep(500);
            BaseStep.clickElement(kargoAyarlari, "Formül Editörü sayfası");
            Thread.sleep(500);
            LogTest.info("Formül Editörü sayfası açıldı");
            //BaseStep.navigateToUrl("https://test.gatexpress.com/admin");
            WebElement dashboard = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/nav/a[1]", TimeOut.LONG.value);
            BaseStep.clickElement(dashboard, "Dashboard sayfasına dönüldü");
            LogTest.info("Admin sayfasına geri dönüldü");
        }

        @Test
        @Order(9)
        @DisplayName("Dashboard sayfası_3.Kart_Zone Mapping")
        public void kargoZoneMapping() throws InterruptedException {
            LogTest.info("Dashboard - Zone Mapping butonu");
            WebElement kargoAyarlari = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div[3]/div/a[3]", TimeOut.LONG.value);
            LogTest.info("Zone Mapping butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(kargoAyarlari, "Zone Mapping sayfası");
            Thread.sleep(500);
            LogTest.info("Zone Mapping sayfası açıldı");
            //BaseStep.navigateToUrl("https://test.gatexpress.com/admin");
            WebElement dashboard = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/nav/a[1]", TimeOut.LONG.value);
            BaseStep.clickElement(dashboard, "Dashboard sayfasına dönüldü");
            LogTest.info("Admin sayfasına geri dönüldü");
        }

        @Test
        @Order(10)
        @DisplayName("Dashboard sayfası_3.Kart_Zone CSV Import")
        public void kargoZoneCVS() throws InterruptedException {
            LogTest.info("Dashboard - Zone CSV Import butonu");
            WebElement kargoAyarlari = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div[3]/div/a[4]", TimeOut.LONG.value);
            LogTest.info("Zone CSV Import butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(kargoAyarlari, "Zone CSV Import sayfası");
            Thread.sleep(500);
            LogTest.info("Zone CSV Import sayfası açıldı");
            //BaseStep.navigateToUrl("https://test.gatexpress.com/admin");
            WebElement dashboard = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/nav/a[1]", TimeOut.LONG.value);
            BaseStep.clickElement(dashboard, "Dashboard sayfasına dönüldü");
            LogTest.info("Admin sayfasına geri dönüldü");
        }

        @Test
        @Order(11)
        @DisplayName("Dashboard sayfası_3.Kart_Kargo Firmaları")
        public void kargoFirmaları() throws InterruptedException {
            LogTest.info("Dashboard - Zone CSV Import butonu");
            WebElement kargoAyarlari = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div[3]/div/a[5]", TimeOut.LONG.value);
            LogTest.info("Zone CSV Import butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(kargoAyarlari, "Zone CSV Import sayfası");
            Thread.sleep(500);
            LogTest.info("Zone CSV Import sayfası açıldı");
            //BaseStep.navigateToUrl("https://test.gatexpress.com/admin");
            WebElement dashboard = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/nav/a[1]", TimeOut.LONG.value);
            BaseStep.clickElement(dashboard, "Dashboard sayfasına dönüldü");
            LogTest.info("Admin sayfasına geri dönüldü");

        }

        @Test
        @Order(12)
        @DisplayName("Dashboard sayfası_4.Zone CSV")
        public void zoneConfiguration() throws InterruptedException {
            LogTest.info("Dashboard - Zone CSV Import butonu-2");
            WebElement zoneConfiguration = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div[4]/div/a", TimeOut.LONG.value);
            LogTest.info("Zone CSV Import butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(zoneConfiguration, "Zone CSV Import sayfası");
            Thread.sleep(500);
            LogTest.info("Zone CSV Import sayfası açıldı");
            //BaseStep.navigateToUrl("https://test.gatexpress.com/admin");
            WebElement dashboard = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/nav/a[1]", TimeOut.LONG.value);
            BaseStep.clickElement(dashboard, "Dashboard sayfasına dönüldü");
            LogTest.info("Admin sayfasına geri dönüldü");
        }

        @Test
        @Order(13)
        @DisplayName("Ülke Yönetimi sayfası_Yeni ülke Import Et Butonu")
        public void ulkeSayfasıYeniImport() throws InterruptedException {
            LogTest.info("Ülke Import sayfası açıldı");
            WebElement ulkeYönetimi = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/nav/a[2]", TimeOut.LONG.value);
            LogTest.info("Ülke Yönetimi butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(ulkeYönetimi, "Ülke Yönetimi sayfası açıldı");
            Thread.sleep(500);
            LogTest.info("Yeni Ülke Import Et");
            WebElement ulkeYönetimiImport = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/a", TimeOut.LONG.value);
            LogTest.info("Yeni Ülke Import butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(ulkeYönetimiImport, "Ülke Import sayfası");
            Thread.sleep(500);
            LogTest.info("Ülke Import sayfası açıldı");
            //BaseStep.navigateToUrl("https://test.gatexpress.com/

        }

        @Test
        @Order(14)
        @DisplayName("Ülke Yönetimi sayfası_Ülke Listesine Dön Butonu")
        public void ulkeListesineDön() throws InterruptedException {
            LogTest.info("Yeni Ülke İmport sayfası açıldı");
            //BaseStep.navigateToUrl("https://test.gatexpress.com/
            WebElement ulkeListesi = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/a", TimeOut.LONG.value);
            LogTest.info("Ülke Listesine Dön butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(ulkeListesi, "Ülke Yönetimi sayfasına dönüldü");
            Thread.sleep(500);
            LogTest.info("İmport edilmiş ülkeler sayfasına geri dönüldü");
        }


        @Test
        @Order(15)
        @DisplayName("Shipping Rates sayfası - Shipping Rates Listesine Dön Butonu")
        public void shippingRatesBack() throws InterruptedException {
            LogTest.info("Shipping Rates sayfası açıldı");
            WebElement shippingRates0 = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/nav/a[3]", TimeOut.LONG.value);
            LogTest.info("Shipping Rates butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(shippingRates0, "Shipping Rates sayfası");
            Thread.sleep(500);
            LogTest.info("Shipping Rates sayfası açıldı");

            LogTest.info("Import Excel Butonu");
            WebElement shippingRatesImport0 = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/a[2]/span", TimeOut.LONG.value);
            LogTest.info("Import Excel butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(shippingRatesImport0, "Shipping Rates Import sayfası");
            Thread.sleep(500);
            LogTest.info("Shipping Rates Import sayfası açıldı");

            LogTest.info("Import Excel -- Dosya Seç Butonu");
            WebElement dosyaSec = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div/button", TimeOut.LONG.value);
            LogTest.info("Ülke Listsine Dön butonunu tıklandır");
            BaseStep.clickElement(dosyaSec, "Dosya Yönetiicisi");
            LogTest.info("Dosya Yöneticisi sayfası açıldı");
        }

        @Test
        @Order(16)
        @DisplayName("Shipping Rates sayfası -- Ülke Import -- Dosya Seç Butonu")
        public void shippingRatesDosya() throws InterruptedException {
            LogTest.info("Shipping Rates sayfası açıldı");
            WebElement shippingRates = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/nav/a[3]", TimeOut.LONG.value);
            LogTest.info("Shipping Rates butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(shippingRates, "Shipping Rates sayfası açıldı");
            Thread.sleep(500);

            LogTest.info("Import Excel Butonu");
            WebElement shippingRatesImport = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/a[2]/span", TimeOut.LONG.value);
            LogTest.info("Import Excel butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(shippingRatesImport, "Shipping Rates Import sayfası");
            Thread.sleep(500);
            LogTest.info("Shipping Rates Import sayfası açıldı");

            LogTest.info("Ülke Listesine Dön Butonu");
            WebElement shippingRateslistesi = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/a", TimeOut.LONG.value);
            LogTest.info("Ülke Listsine Dön butonunu tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(shippingRateslistesi, "Shipping Rates sayfası");
            Thread.sleep(500);
            LogTest.info("Shipping Rates sayfası açıldı");
        }

        @Test
        @Order(17)
        @DisplayName("Shipping Rates sayfası -- Görünüm -- Gruplu Butonu")
        public void shippingRatesGorunum() throws InterruptedException {
            LogTest.info("Shipping Rates sayfası açıldı");
            WebElement shippingRates = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/nav/a[3]", TimeOut.LONG.value);
            LogTest.info("Shipping Rates butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(shippingRates, "Shipping Rates sayfası");
            Thread.sleep(500);
            LogTest.info("Shipping Rates sayfası açıldı");

            LogTest.info("Grup Butonu");
            WebElement shippingRatesGrup = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[1]/div/button[2]/span", TimeOut.LONG.value);
            LogTest.info("Grup görünümü butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(shippingRatesGrup, "Gruplu görünüm");
            Thread.sleep(500);
            LogTest.info("Gruplu Görünüm oluştu");

            LogTest.info("Tablo Butonu");
            WebElement shippingRatesTablo = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[1]/div/button[1]/span", TimeOut.LONG.value);
            LogTest.info("Tablo görünümü butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(shippingRatesTablo, "Tablo görünüm");
            Thread.sleep(500);
            LogTest.info("Tablo Görünüm oluştu");

            LogTest.info("Temizle Butonu");
            WebElement shippingRatesTemizle = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[6]/button", TimeOut.LONG.value);
            LogTest.info("Temizle Butonuna tıklandır");
            Thread.sleep(300);
            BaseStep.clickElement(shippingRatesTemizle, "Filtrelerin Temizlenmesi");
            Thread.sleep(300);
            LogTest.info("Girilen değerler Temizlendi");

            LogTest.info("Admin Paneline Geri Dön Butonu");
            WebElement shippingRatesAdmin = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/a[1]", TimeOut.LONG.value);
            LogTest.info("Admin Paneline Geri Dön Butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(shippingRatesAdmin, "Admin Paneli");
            Thread.sleep(500);
            LogTest.info("Admin Paneli açıldı");

        }

        @Test
        @Order(18)
        @DisplayName("Kargo Ayarları Sayfası - Formül Editörü")
        public void kargoAyarlarıFormül() throws InterruptedException {
            LogTest.info("Kargo Ayarları butonu");
            WebElement kargoAyarlari = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/nav/a[4]", TimeOut.LONG.value);
            LogTest.info("Kargo Ayarları butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(kargoAyarlari, "Kargo Ayarları sayfası ");
            Thread.sleep(500);
            LogTest.info("Kargo Ayarları sayfası açıldı");

            LogTest.info("Formül Editörü Butonu");
            WebElement shippingRatesGrup = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/a[1]", TimeOut.LONG.value);
            LogTest.info("Formül Editörü butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(shippingRatesGrup, "Formül Editörü sayfası");
            Thread.sleep(500);
            LogTest.info("Formül Editörü sayfası açıldı");
        }

        @Test
        @Order(19)
        @DisplayName("Kargo Ayarları Sayfası - Formül Editörü - Yeni Formül Butonu")
        public void kargoFormülYeni() throws InterruptedException {
            LogTest.info("Yeni Formül Butonu");
            WebElement shippingRatesGrup = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/button", TimeOut.LONG.value);
            LogTest.info("Yeni Formül butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(shippingRatesGrup, "Yeni Formül sayfası");
            Thread.sleep(500);
            LogTest.info("Yeni Formül sayfası açıldı");
        }

        @Test
        @Order(20)
        @DisplayName("Kargo Ayarları Sayfası - Formül Editörü - Varsayılan Butonu")
        public void kargoFormülVarsayılan() throws InterruptedException {
            LogTest.info("Varsayılan Butonu");
            WebElement shippingRatesGrup = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[4]/div[1]/div/div[2]/div[3]/button[2]", TimeOut.LONG.value);
            LogTest.info("Varsayılan butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(shippingRatesGrup, "Varsayılan değişmemiş formül hali");
            Thread.sleep(800);
            LogTest.info("Formül değişiklikleri kaldırılır");
        }

        @Test
        @Order(21)
        @DisplayName("Kargo Ayarları Sayfası - Formül Editörü - İptal Butonu")
        public void kargoFromülIptal() throws InterruptedException {
            LogTest.info("İptal butonu");
            WebElement kargoAyarlari = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[4]/div[1]/div/div[2]/div[3]/button[3]", TimeOut.LONG.value);
            LogTest.info("Yeni Formül-İptal butonuna tıklandır");
            Thread.sleep(900);
            BaseStep.clickElement(kargoAyarlari, "Formül Editörü sayfası ");
            Thread.sleep(900);
            LogTest.info("Formül Editörü sayfası açıldı");
        }

        @Test
        @Order(22)
        @DisplayName("Kargo Ayarları Sayfası - Formül Editörü - Test Et Butonu")
        public void kargoTest() throws InterruptedException {
            LogTest.info("Test Et butonu");
            WebElement kargoAyarlari = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[4]/div[2]/div[1]/div[2]/button", TimeOut.LONG.value);
            LogTest.info("Test Et butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(kargoAyarlari, "Formül Editörü sayfası ");
            Thread.sleep(800);
            LogTest.info("Test Sonucunun ekranda görünmesi");

        }/*
        @Test
        @Order(23)
        @DisplayName("Kargo Ayarları Sayfası - Sil Butonu")
        public void kargoSil() throws InterruptedException {
            LogTest.info("Sil butonu");
            WebElement kargoAyarlari = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[4]/div[1]/div/div[2]/div[4]/button", TimeOut.LONG.value);
            LogTest.info("Sil butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(kargoAyarlari, "Formüllü silmek için gelen uyarı pop ");
            Thread.sleep(800);
            LogTest.info("Uyarı pop geldi");

            LogTest.info("Kargo Ayarları butonu");
            WebElement kargoAyarlari2 = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/nav/a[4]", TimeOut.LONG.value);
            LogTest.info("Kargo Ayarları butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(kargoAyarlari2, "Kargo Ayarları sayfası ");
            Thread.sleep(500);
            LogTest.info("Kargo Ayarları sayfası açıldı");



        }*/

        @Test
        @Order(23)
        @DisplayName("Kargo Ayarları Sayfası -Kargo Ayarları Butonu")
        public void kargoBack() throws InterruptedException {
            LogTest.info("Kargo Ayarları butonu");
            WebElement kargoAyarlari = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/nav/a[4]", TimeOut.LONG.value);
            LogTest.info("Kargo Ayarları butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(kargoAyarlari, "Kargo Ayarları sayfası ");
            Thread.sleep(500);
            LogTest.info("Kargo Ayarları sayfası açıldı");

            LogTest.info("Formül Editörü Butonu");
            WebElement formülEditörü = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/a[1]", TimeOut.LONG.value);
            LogTest.info("Formül Editörü butonuna tıklandır");
            Thread.sleep(500);
            BaseStep.clickElement(formülEditörü, "Formül Editörü sayfası");
            Thread.sleep(500);
            LogTest.info("Formül Editörü sayfası açıldı");

            LogTest.info("Kargo Ayarları butonu");
            WebElement kargoAyarlariBack = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/a", TimeOut.LONG.value);
            LogTest.info("Kargo Ayarları butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(kargoAyarlariBack, "Kargo Ayarları Sayfası ");
            Thread.sleep(800);
            LogTest.info("Kargo Ayarları sayfası açıldı");
        }

        @Test
        @Order(24)
        @DisplayName("Kargo Ayarları Sayfası - ZoneMapping Butonu")
        public void kargoZone() throws InterruptedException {
            LogTest.info("Zone Mapping butonu");
            WebElement zoneMappingButton = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/a[2]", TimeOut.LONG.value);
            LogTest.info("Zone Mapping butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(zoneMappingButton, "Zone Mapping sayfası ");
            Thread.sleep(800);
            LogTest.info("Zone Mapping sayfası açıldı");

        }

        @Test
        @Order(25)
        @DisplayName("Kargo Ayarları Sayfası - ZoneMapping - Yeni Mapping Butonu")
        public void kargoZoneYeni() throws InterruptedException {
            LogTest.info("Yeni Mapping butonu");
            WebElement zoneMappingYeniButton = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/button", TimeOut.LONG.value);
            LogTest.info("Yeni Mapping butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(zoneMappingYeniButton, "Yeni Mapping sayfası ");
            Thread.sleep(800);
            LogTest.info("Yeni Mapping sayfası açıldı");
        }

        @Test
        @Order(26)
        @DisplayName("Kargo Ayarları Sayfası - ZoneMapping - Yeni Mapping -Kaydet Butonu")
        public void kargoZoneYeniKaydet() throws InterruptedException {
            LogTest.info("Yeni Mapping - Kaydet Butonu");
            WebElement mappingKaydetButton = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[5]/div/div/div[2]/button[2]", TimeOut.LONG.value);
            LogTest.info("Kaydet butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(mappingKaydetButton, "Yeni Mapping kaydedilir");
            Thread.sleep(800);
            LogTest.info("Kaydedilen firma ekranında görünecek");
        }/*

        @Test
        @Order(27)
        @DisplayName("Kargo Ayarları Sayfası - ZoneMapping - Yeni Mapping - Sil Butonu")
        public void kargoZoneYeniSil() throws InterruptedException {
            LogTest.info("Yeni Mapping - İptal  Butonu");
            WebElement zoneMappingButton = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[5]/div/div/div[2]/button[1]", TimeOut.LONG.value);
            LogTest.info("İptal butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(zoneMappingButton, "Zone Mapping sayfası");
            Thread.sleep(800);
            LogTest.info("Zone Mapping sayfası açıldı");

            LogTest.info("Kargo Ayarları butonu");
            WebElement kargoAyarlariBack = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/a", TimeOut.LONG.value);
            LogTest.info("Kargo Ayarları butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(kargoAyarlariBack, "Kargo Ayarları Sayfası ");
            Thread.sleep(800);
            LogTest.info("Kargo Ayarları sayfası açıldı");

        }*/
        @Test
        @Order(27)
        @DisplayName("Kargo Ayarları Sayfası - ZoneMapping - Export Butonu")
        public void kargoZoneYeniExport() throws InterruptedException {
            LogTest.info("Zone Mapping - Export Butonu");
            WebElement mappingExportButton = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[4]/div[1]/div/button", TimeOut.LONG.value);
            LogTest.info("Export butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(mappingExportButton, "Export edildi");
            Thread.sleep(800);
            LogTest.info("Zone Mappingler içe aktarıldı");
        }
        @Test
        @Order(28)
        @DisplayName("Kargo Ayarları Sayfası - ZoneMapping - Import Butonu")
        public void kargoZoneYeniImport() throws InterruptedException {
            LogTest.info("Zone Mapping - Import Butonu");
            WebElement mappingImportButton = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[4]/div[1]/div/a", TimeOut.LONG.value);
            LogTest.info("Import butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(mappingImportButton, "Import edildi");
            Thread.sleep(800);
            LogTest.info("Zone Mappingler dışa aktarıldı");
        }
        @Test
        @Order(29)
        @DisplayName("Zone Mapping Sayfası - Import - Dosya Seç Butonu")
        public void kargoZoneImportDosya() throws InterruptedException {
            LogTest.info("Import - Dosya Seç Butonu");
            WebElement zoneMappingButton = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div/button", TimeOut.LONG.value);
            LogTest.info("Dosya Seç butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(zoneMappingButton, "Dosya Yönetimi Sayfası");
            Thread.sleep(800);
            LogTest.info("Dosya Yönetimi  Sayfası Açıldı");
        }
        @Test
        @Order(30)
        @DisplayName("Zone Mapping Sayfası - Import - Zone Mapping'e Dön Butonu")
        public void zoneBack () throws InterruptedException {
            LogTest.info("Zone Mapping'e Dön Butonu");
            WebElement mappingBackButton = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/a", TimeOut.LONG.value);
            LogTest.info("Zone Mapping'e Dön butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(mappingBackButton, "Zone Mapping Sayfası");
            Thread.sleep(800);
            LogTest.info("Zone Mapping Sayfası Açıldı");
        }
        @Test
        @Order(31)
        @DisplayName("Zone Mapping Sayfası - Temizle Butonu")
        public void zoneTemizle () throws InterruptedException {
            LogTest.info("Temizle Butonu");
            WebElement mappingBackButton = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[3]/div/button", TimeOut.LONG.value);
            LogTest.info("Temizle butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(mappingBackButton, "Filtrelemede yapılan seçimler silinmesi");
            Thread.sleep(800);
            LogTest.info("Yapılan Seçimler silindi");
        }
        @Test
        @Order(32)
        @DisplayName("Zone Mapping Sayfası - Kargo Ayarları Butonu")
        public void zoneBackKargo () throws InterruptedException {
            LogTest.info("Kargo Ayarları Butonu");
            WebElement mappingBackButton = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/a", TimeOut.LONG.value);
            LogTest.info("Kargo Ayarları butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(mappingBackButton, "Kargo Ayarları sayfası");
            Thread.sleep(800);
            LogTest.info("Kargo Ayarları sayfası açıldı");
        }
        @Test
        @Order(33)
        @DisplayName("Kargo Firmaları Sayfası - Kargo Ayarları Butonu")
        public void kargoFirmalarıButton () throws InterruptedException {
            LogTest.info("Kargo Firmaları Butonu");
            WebElement kargoAyarlarıButton = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/a[3]", TimeOut.LONG.value);
            LogTest.info("Kargo Firmaları butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(kargoAyarlarıButton, "Kargo Firmaları sayfası");
            Thread.sleep(800);
            LogTest.info("Kargo Firmaları sayfası açıldı");
        }
        @Test
        @Order(34)
        @DisplayName("Kargo Firmaları Sayfası - Yeni Kargo Firması Butonu")
        public void yeniKargoFirmasıButton () throws InterruptedException {
            LogTest.info("Yeni Kargo Firması Butonu");
            WebElement yeniKargoButton = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/a[2]", TimeOut.LONG.value);
            LogTest.info("Yeni Kargo Firması Butonu tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(yeniKargoButton, "Yeni Kargo Firması sayfası");
            Thread.sleep(800);
            LogTest.info("Yeni Kargo Firması sayfası açıldı");
        }
        @Test
        @Order(35)
        @DisplayName("Yeni Kargo Firması-Oluştur Butonu")
        public void yeniKargoFirmasıOlustur () throws InterruptedException {
            LogTest.info("Oluştur Butonu");
            WebElement yeniKargoOlustur = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/form/div[4]/button[2]", TimeOut.LONG.value);
            LogTest.info("Oluştur Butonu tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(yeniKargoOlustur, "Yeni Kargo Firması");
            Thread.sleep(800);
            LogTest.info("Yeni Kargo Firması listede");
        }
        @Test
        @Order(36)
        @DisplayName("Yeni Kargo Firması-İptal Butonu")
        public void yeniKargoFirmasıIptal () throws InterruptedException {
            LogTest.info("İptal Butonu");
            WebElement yeniKargoButton = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/form/div[4]/button[1]", TimeOut.LONG.value);
            LogTest.info("İptal Butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(yeniKargoButton, "Kargo Firmaları sayfası");
            Thread.sleep(800);
            LogTest.info("Kargo Firmaları sayfası açıldı");
        }
        @Test
        @Order(37)
        @DisplayName("Kargo Firmaları Sayfası - Kargo Ayarları Butonu")
        public void kargoFirmalarıBack () throws InterruptedException {
            LogTest.info("Kargo Ayarları Butonu");
            WebElement yeniKargoButton = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/a[1]", TimeOut.LONG.value);
            LogTest.info("Kargo Ayarları Butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(yeniKargoButton, "Kargo Ayarları sayfası");
            Thread.sleep(800);
            LogTest.info("Kargo Ayarları sayfası açıldı");
        }
        @Test
        @Order(38)
        @DisplayName("Kargo Ayarları Sayfası - Temizleme Butonu")
        public void kargoAyarlarıTemizleme () throws InterruptedException {
            LogTest.info("Temizleme Butonu");
            WebElement temizlemeButton = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[3]/div/button", TimeOut.LONG.value);
            LogTest.info("Temizleme Butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(temizlemeButton, "Filtrelerdeki seçimleri silinmesi");
            Thread.sleep(800);
            LogTest.info("Filtre seçimleri temizlendi");
        }
        @Test
        @Order(39)
        @DisplayName("Kargo Ayarları Sayfası - Yeni Formül Butonu")
        public void kargoAyarlarıYeniFormül () throws InterruptedException {
            LogTest.info("Kargo Ayarları- Yeni Formül Butonu");
            WebElement yeniKargoButton = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/a[1]", TimeOut.LONG.value);
            LogTest.info("Yeni Formül butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(yeniKargoButton, "Formül Editörü sayfası");
            Thread.sleep(800);
            LogTest.info("Formül Editörü sayfası açıldı");
        }
        @Test
        @Order(40)
        @DisplayName("Çıkış Yap Butonu")
        public void quıt () throws InterruptedException {
            LogTest.info("Çıkış Yap Butonu");
            WebElement yeniKargoButton = BaseStep.findElementXpathWithWait("//*[@id=\"root\"]/div/div/div[1]/header/div[2]/button", TimeOut.LONG.value);
            LogTest.info("Kargo Ayarları Butonuna tıklandır");
            Thread.sleep(800);
            BaseStep.clickElement(yeniKargoButton, "Kargo Ayarları sayfası");
            Thread.sleep(800);
            LogTest.info("Kargo Ayarları sayfası açıldı");
        }


    }
