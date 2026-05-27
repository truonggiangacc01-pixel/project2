package project2.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import project2.entity.*;
import project2.service.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private AdminService adminService;
    @Autowired
    private HorseService horseService;
    @Autowired
    private HorseOwnerService horseOwnerService;
    @Autowired
    private JockeyService jockeyService;
    @Autowired
    private NotificationService notificationService;
    @Autowired
    private PredictionService predictionService;
    @Autowired
    private PrizeService prizeService;
    @Autowired
    private RaceParticipationService raceParticipationService;
    @Autowired
    private RaceRefereeService raceRefereeService;
    @Autowired
    private RaceResultService raceResultService;
    @Autowired
    private RaceScheduleService raceScheduleService;
    @Autowired
    private SpectatorService spectatorService;
    @Autowired
    private TicketService ticketService;
    @Autowired
    private TournamentService tournamentService;

    @Override
    public void run(String... args) throws Exception {

        /*___________________________________________________________________________________________________________ */
        //                                                  ADMIN
        Admin ad1 = new Admin("tranvan_admin",    "ad123", "tranavan.admin@duangua.vn");
        Admin ad2 = new Admin("lehoang_admin",    "ad123", "lehoang.admin@duangua.vn");
        Admin ad3 = new Admin("phamthinh-admin",  "ad123", "phamthinh.admin@duangua.vn");
        Admin ad4 = new Admin("nguyenbich_admin", "ad123", "nguyenbich.admin@duangua.vn");
        Admin ad5 = new Admin("tranduong_admin",  "ad123", "tranduong.admin@duangua.vn");
        Admin ad6 = new Admin("phanvu_admin",     "ad123", "phanvu.admin@duangua.vn");
        Admin ad7 = new Admin("dolan_admin",      "ad123", "dolan.admin@duangua.vn");
        Admin ad8 = new Admin("voquoc_admin",     "ad123", "voquoc.admin@duangua.vn");
        Admin ad9 = new Admin("buianh_admin",     "ad123", "buianh.admin@duangua.vn");
        Admin ad10= new Admin("vuongminh_admin",  "ad123", "vuongminh.admin@duangua.vn");




        /*___________________________________________________________________________________________________________ */
        //                                                  SPECTATOR
        Spectator spec1 = new Spectator("khangia_tuan", "tuankh@gmail.com",    "spec123");
        Spectator spec2 = new Spectator("yeuthethao99", "thethao99@gmail.com", "spec123");
        Spectator spec3 = new Spectator("ngoclinh_fan", "ngoclinh@gmail.com",  "spec123");
        Spectator spec4 = new Spectator("huyhoang_bet", "huyhoang@gmail.com",  "spec123");
        Spectator spec5 = new Spectator("mai_phuong22", "phuongmai@gmail.com", "spec123");
        Spectator spec6 = new Spectator("thantai_den",  "thantai@gmail.com",   "spec123");
        Spectator spec7 = new Spectator("quocbao_88",   "quocbao88@gmail.com", "spec123");
        Spectator spec8 = new Spectator("minhhang_vip", "minhhang@gmail.com",  "spec123");
        Spectator spec9 = new Spectator("trandung_win", "trandung@gmail.com",  "spec123");
        Spectator spec10= new Spectator("lelan_smile",  "lelan@gmail.com",     "spec123");



        /*___________________________________________________________________________________________________________ */
        //                                                  HORSE OWNER
        HorseOwner ho1 = new HorseOwner("Lý Gia Thành",   "ThanhLGT", "0901112233", "ho123", "giathanh.owner@gmail.com");
        HorseOwner ho2 = new HorseOwner("Trương Đại Lộc", "LocTĐL",   "0902223344", "ho123", "dailoc.owner@gmail.com");
        HorseOwner ho3 = new HorseOwner("Trần Phú Qúy",   "QuyTPQ",   "0903334455", "ho123", "phuquy.owner@gmail.com");
        HorseOwner ho4 = new HorseOwner("Nguyễn Tài Phát","PhatNTP",  "0904445566", "ho123", "taiphat.owner@gmail.com");
        HorseOwner ho5 = new HorseOwner("Đặng Hữu Trí",   "TriĐHT",   "0905556677", "ho123", "huutri.owner@gmail.com");
        HorseOwner ho6 = new HorseOwner("Vương Hùng Tiến","TienVHT",  "0906667788", "ho123", "hungtien.owner@gmail.com");
        HorseOwner ho7 = new HorseOwner("Lê Minh Tâm",    "TamLMT",   "0907778899", "ho123", "minhtam.owner@gmail.com");
        HorseOwner ho8 = new HorseOwner("Phạm Thị Vượng", "VuongPTV", "0908889900", "ho123", "thivuong.owner@gmail.com");
        HorseOwner ho9 = new HorseOwner("Bùi Quốc Vượng", "VuongBQV", "0909990011", "ho123", "quocvuong.owner@gmail.com");
        HorseOwner ho10= new HorseOwner("Ngô Tiến Đạt",   "DatNTĐ",   "0901001122", "ho123", "tiendat.owner@gmail.com");




        /*___________________________________________________________________________________________________________ */
        //                                                  JOCKEY
        Jockey joc1 = new Jockey("Trần Kỵ Thương",    "ThuongTKT",  25, 4, "0981112233", "Jock123");
        Jockey joc2 = new Jockey("Lê Bá Vũ",          "VuLBV",      29, 8, "0982223344", "Jock123");
        Jockey joc3 = new Jockey("Nguyễn Phi Trường", "TruongNPT",  24, 3, "0983334455", "Jock123");
        Jockey joc4 = new Jockey("Phạm Dũng Cảm",     "CamPDC",     32, 10,"0984445566", "Jock123");
        Jockey joc5 = new Jockey("Đinh Thần Tốc",     "TocĐTT",     27, 6, "0985556677", "Jock123");
        Jockey joc6 = new Jockey("Vũ Phong Nhã",      "NhaVPN",     26, 5, "0986667788", "Jock123");
        Jockey joc7 = new Jockey("Hồ Quang Uy",       "UyHQU",      30, 9, "0987778899", "Jock123");
        Jockey joc8 = new Jockey("Lý Phi Long",       "LongLPL",    23, 2, "0988889900", "Jock123");
        Jockey joc9 = new Jockey("Cao Vạn Dặm",       "DamCVD",     28, 7, "0989990011", "Jock123");
        Jockey joc10= new Jockey("Bùi Uy Dũng",       "DungBUD",    31, 11,"0981001122", "Jock123");



        /*___________________________________________________________________________________________________________ */
        //                                                  RACE REFEREE
        RaceReferee ref1 = new RaceReferee("Lương Công Bằng",  "BangLCB", "0911112233", "RaRe123", "congbang.ref@mail.com");
        RaceReferee ref2 = new RaceReferee("Trịnh Chính Trực", "TrucTCT", "0912223344", "RaRe123", "chinhtruc.ref@mail.com");
        RaceReferee ref3 = new RaceReferee("Tạ Khách Quan",    "QuanTKQ", "0913334455", "RaRe123", "khachquan.ref@mail.com");
        RaceReferee ref4 = new RaceReferee("Võ Minh Bạch",     "AchVMB",  "0914445566", "RaRe123", "minhbach.ref@mail.com");
        RaceReferee ref5 = new RaceReferee("Đào Công Tâm",     "AmĐCT",   "0915556677", "RaRe123", "congtam.ref@mail.com");
        RaceReferee ref6 = new RaceReferee("Phan Trung Lập",   "LapPTL",  "0916667788", "RaRe123", "trunglap.ref@mail.com");
        RaceReferee ref7 = new RaceReferee("Bùi Đức Minh",     "InhBĐM",  "0917778899", "RaRe123", "duicminh.ref@mail.com");
        RaceReferee ref8 = new RaceReferee("Đoàn Quang Sang",  "SangĐQS", "0918889900", "RaRe123", "quangsang.ref@mail.com");
        RaceReferee ref9 = new RaceReferee("Chu Uy Nghiêm",    "IemCUN",  "0919990011", "RaRe123", "uynghiem.ref@mail.com");
        RaceReferee ref10= new RaceReferee("Lâm Quyết Đoán",   "DoanLQĐ", "0911001122", "RaRe123", "quyetdoan.ref@mail.com");



        /*___________________________________________________________________________________________________________ */
        //                                                  HORSE
        Horse h1 = new Horse("Bão Táp",     4, "Thoroughbred",  "Khỏe mạnh");
        Horse h2 = new Horse("Sấm Sét",     5, "Quarter Horse", "Khỏe mạnh");
        Horse h3 = new Horse("Xích Thố",    3, "Arabian",       "Khỏe mạnh");
        Horse h4 = new Horse("Bạch Mã",     6, "Thoroughbred",  "Đang hồi phục");
        Horse h5 = new Horse("Phi Yến",     4, "Appaloosa",     "Khỏe mạnh");
        Horse h6 = new Horse("Hắc Ám",      5, "Thoroughbred",  "Chấn thương nhẹ");
        Horse h7 = new Horse("Tia Chớp",    3, "Quarter Horse", "Khỏe mạnh");
        Horse h8 = new Horse("Đại Bàng",    7, "Arabian",       "Khỏe mạnh");
        Horse h9 = new Horse("Gió Lốc",     4, "Thoroughbred",  "Khỏe mạnh");
        Horse h10= new Horse("Kim Long",    6, "Standardbred",  "Khỏe mạnh");
        Horse h11= new Horse("Hỏa Phụng",   5, "Akhal-Teke",    "Khỏe mạnh");
        Horse h12= new Horse("Vũ Điệu",     3, "Thoroughbred",  "Khỏe mạnh");
        Horse h13= new Horse("Bóng Đêm",    5, "Friesian",      "Đang theo dõi");
        Horse h14= new Horse("Thần Mã",     6, "Quarter Horse", "Khỏe mạnh");
        Horse h15= new Horse("Tuyết Trắng", 4, "Arabian",       "Khỏe mạnh");
        Horse h16= new Horse("Tinh Tú",     3, "Thoroughbred",  "Khỏe mạnh");
        Horse h17= new Horse("Hùng Tướng",  7, "Mustang",       "Khỏe mạnh");
        Horse h18= new Horse("Mây Mưa",     5, "Paint Horse",   "Khỏe mạnh");
        Horse h19= new Horse("Sơn Lâm",     4, "Thoroughbred",  "Khỏe mạnh");
        Horse h20= new Horse("Độc Hành",    6, "Standardbred",  "Chấn thương nhẹ");

        /*___________________________________________________________________________________________________________ */
        //                                                  TOURNAMENT
        Tournament tour1 = new Tournament("Giải Đua Ngựa Khai Xuân 2025", "Trường đua Đại Nam", LocalDate.of(2025, 2, 10), LocalDate.of(2025, 2,  15));
        Tournament tour2 = new Tournament("Giải Đua Ngựa Đón Hè 2025",    "Trường đua Phú Thọ", LocalDate.of(2025, 5, 15), LocalDate.of(2025, 5,  20));
        Tournament tour3 = new Tournament("Giải Đua Ngựa Vượt Thu 2025",  "Trường đua Sóc Sơn", LocalDate.of(2025, 8, 20), LocalDate.of(2025, 8,  25));
        Tournament tour4 = new Tournament("Giải Đua Ngựa Chinh Đông 2025","Trường đua Đại Nam", LocalDate.of(2025, 11,5), LocalDate.of( 2025,  11,  10));
        Tournament tour5 = new Tournament("Giải Vô Địch Quốc Gia 2025",   "Trường đua Phú Thọ", LocalDate.of(2025, 12,20), LocalDate.of(2025, 12, 30));
        Tournament tour6 = new Tournament("Giải Đua Ngựa Khai Xuân 2026", "Trường đua Đại Nam", LocalDate.of(2026, 2, 10), LocalDate.of(2026, 2,  15));
        Tournament tour7 = new Tournament("Giải Đua Ngựa Đón Hè 2026",    "Trường đua Phú Thọ", LocalDate.of(2026, 5, 15), LocalDate.of(2026, 5,  20));
        Tournament tour8 = new Tournament("Giải Đua Ngựa Vượt Thu 2026",  "Trường đua Sóc Sơn", LocalDate.of(2026, 8, 20), LocalDate.of(2026, 8,  25));
        Tournament tour9 = new Tournament("Giải Đua Ngựa Chinh Đông 2026","Trường đua Đại Nam", LocalDate.of(2026, 11,5), LocalDate.of( 2026,  11,  10));
        Tournament tour10= new Tournament("Giải Vô Địch Quốc Gia 2026",   "Trường đua Phú Thọ", LocalDate.of(2026, 12,20), LocalDate.of(2026, 12, 30));

        /*___________________________________________________________________________________________________________ */
        //                                                  PRIZE
        Prize p1 = new Prize("Giải Nhất", BigDecimal.valueOf(2500000000.00),1);
        Prize p2 = new Prize("Giải Nhì",  BigDecimal.valueOf(1375000000.00),2);
        Prize p3 = new Prize("Giải Ba",   BigDecimal.valueOf(937500000.00), 3);
        Prize p4 = new Prize("Giải Tư",   BigDecimal.valueOf(562500000.00), 4);
        Prize p5 = new Prize("Giải Năm",  BigDecimal.valueOf(375000000.00), 5);
        Prize p6 = new Prize("Giải Sáu",  BigDecimal.valueOf(375000000.00), 6);
        Prize p7 = new Prize("Giải Bảy",  BigDecimal.valueOf(375000000.00), 7);
        Prize p8 = new Prize("Giải Tám",  BigDecimal.valueOf(375000000.00), 8);

        /*___________________________________________________________________________________________________________ */
        //                                                  TICKET






    }





}
