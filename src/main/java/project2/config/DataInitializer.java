package project2.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import project2.entity.*;
import project2.enums.*;
import project2.repository.SpectatorRepo;
import project2.repository.TicketRepo;
import project2.repository.TournamentRepo;
import project2.service.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
    @Autowired
    private TournamentRepo tournamentRepo;
    @Autowired
    private SpectatorRepo spectatorRepo;
    @Autowired
    private TicketRepo ticketRepo;

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

        List<Admin> admins = List.of(ad1, ad2, ad3, ad4, ad5, ad6, ad7, ad8, ad9, ad10);

        for(Admin admin : admins){
            adminService.saveAdmin(admin);
        }


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

        List<Spectator> spectators = List.of(spec1, spec2, spec3, spec4, spec5, spec6, spec7, spec8, spec9, spec10);

        for(Spectator spectator : spectators){
            spectatorService.saveSpectator(spectator);
        }
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

        List<HorseOwner> horseOwners = List.of(ho1, ho2, ho3, ho4, ho5, ho6, ho7, ho8, ho9, ho10);

        for(HorseOwner horseOwner : horseOwners){
            horseOwnerService.saveHorseOwner(horseOwner);
        }


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

        List<Jockey> jockeys = List.of(joc1, joc2, joc3, joc4, joc5, joc6, joc7, joc8, joc9, joc10);

        for(Jockey jockey : jockeys){
            jockeyService.saveJockey(jockey);
        }

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

        List<RaceReferee> raceReferees = List.of(ref1, ref2, ref3, ref4, ref5, ref6, ref7, ref8, ref9, ref10);

        for(RaceReferee raceReferee : raceReferees){
            raceRefereeService.saveRaceReferee(raceReferee);
        }

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

        //tour1, spec1, spec2
        Ticket t1 = new Ticket(BigDecimal.valueOf(100000), LocalDateTime.of(2025, 2,  1,  9,  0 ),  TicketStatus.USED);
        Ticket t2 = new Ticket(BigDecimal.valueOf(100000), LocalDateTime.of(2025, 2,  2,  9,  0 ),  TicketStatus.USED);

        //tour2, spec3, spec4
        Ticket t3 = new Ticket(BigDecimal.valueOf(150000), LocalDateTime.of(2025, 5,  12, 14, 30), TicketStatus.USED);
        Ticket t4 = new Ticket(BigDecimal.valueOf(150000), LocalDateTime.of(2025, 5,  13, 14, 30), TicketStatus.USED);

        //tour3 , spec5, spec6
        Ticket t5 = new Ticket(BigDecimal.valueOf(120000), LocalDateTime.of(2025, 8,  11, 10, 15), TicketStatus.CANCELLED);
        Ticket t6 = new Ticket(BigDecimal.valueOf(120000), LocalDateTime.of(2025, 8,  12, 10, 15), TicketStatus.USED);

        //tour4, spec7, spec8
        Ticket t7 = new Ticket(BigDecimal.valueOf(120000), LocalDateTime.of(2025, 11, 1,  16, 0 ),  TicketStatus.USED);
        Ticket t8 = new Ticket(BigDecimal.valueOf(120000), LocalDateTime.of(2025, 11, 2,  16, 0 ),  TicketStatus.USED);

        //tour5,spec9, spec10
        Ticket t9 = new Ticket(BigDecimal.valueOf(200000), LocalDateTime.of(2025, 12, 16, 11, 45), TicketStatus.USED);
        Ticket t10= new Ticket(BigDecimal.valueOf(200000), LocalDateTime.of(2025, 12, 17, 11, 45), TicketStatus.CANCELLED);

        //tour6, spec1, spec2
        Ticket t11= new Ticket(BigDecimal.valueOf(100000), LocalDateTime.of(2026, 2,  1,  9,  0 ),  TicketStatus.USED);
        Ticket t12= new Ticket(BigDecimal.valueOf(100000), LocalDateTime.of(2026, 2,  2,  9,  0 ),  TicketStatus.CANCELLED);

        //tour7, spec3, spec4
        Ticket t13= new Ticket(BigDecimal.valueOf(150000), LocalDateTime.of(2026, 5,  12, 14, 30), TicketStatus.USED);
        Ticket t14= new Ticket(BigDecimal.valueOf(150000), LocalDateTime.of(2026, 5,  13, 14, 30), TicketStatus.USED);

        //tour8, spec5, spec6
        Ticket t15= new Ticket(BigDecimal.valueOf(120000), LocalDateTime.of(2026, 8,  11, 10, 15), TicketStatus.SOLD);
        Ticket t16= new Ticket(BigDecimal.valueOf(120000), LocalDateTime.of(2026, 8,  11, 10, 15), TicketStatus.SOLD);

        //tour9, spec7, spec8
        Ticket t17= new Ticket(BigDecimal.valueOf(120000), LocalDateTime.of(2026, 11, 1,  16, 0 ),  TicketStatus.SOLD);
        Ticket t18= new Ticket(BigDecimal.valueOf(120000), LocalDateTime.of(2026, 11, 1,  16, 0 ),  TicketStatus.SOLD);

        //tour10, spec9, spec10
        Ticket t19= new Ticket(BigDecimal.valueOf(200000), LocalDateTime.of(2026, 12, 16, 11, 45), TicketStatus.SOLD);
        Ticket t20= new Ticket(BigDecimal.valueOf(200000), LocalDateTime.of(2026, 12, 16, 11, 45), TicketStatus.SOLD);



        /*___________________________________________________________________________________________________________ */
        //                                                  RACE SCHEDULE
        RaceSchedule rs1 = new RaceSchedule("Bán kết 1 Xuân 2025", LocalDate.of(2025, 2, 12), "Trường đua Đại Nam", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2025, 2, 12, 15, 0), LocalDateTime.of(2025, 2, 12, 17, 0));
        RaceSchedule rs2 = new RaceSchedule("Bán kết 2 Xuân 2025", LocalDate.of(2025, 2, 13), "Trường đua Đại Nam", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2025, 2, 13, 15, 0), LocalDateTime.of(2025, 2, 13, 17, 0));
        RaceSchedule rs3 = new RaceSchedule("Chung kết Xuân 2025", LocalDate.of(2025, 2, 14), "Trường đua Đại Nam", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2025, 2, 14, 15, 0), LocalDateTime.of(2025, 2, 14, 17, 0));

        RaceSchedule rs4 = new RaceSchedule("Bán kết 1 Hè 2025", LocalDate.of(2025, 5, 17), "Trường đua Phú Thọ", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2025, 5, 17, 15, 0), LocalDateTime.of(2025, 5, 17, 17, 0));
        RaceSchedule rs5 = new RaceSchedule("Bán kết 2 Hè 2025", LocalDate.of(2025, 5, 18), "Trường đua Phú Thọ", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2025, 5, 18, 15, 0), LocalDateTime.of(2025, 5, 18, 17, 0));
        RaceSchedule rs6 = new RaceSchedule("Chung kết Hè 2025", LocalDate.of(2025, 5, 19), "Trường đua Phú Thọ", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2025, 5, 19, 15, 0), LocalDateTime.of(2025, 5, 19, 17, 0));

        RaceSchedule rs7 = new RaceSchedule("Bán kết 1 Thu 2025", LocalDate.of(2025, 8, 22), "Trường đua Sóc Sơn", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2025, 8, 22, 15, 0), LocalDateTime.of(2025, 8, 22, 17, 0));
        RaceSchedule rs8 = new RaceSchedule("Bán kết 2 Thu 2025", LocalDate.of(2025, 8, 23), "Trường đua Sóc Sơn", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2025, 8, 23, 15, 0), LocalDateTime.of(2025, 8, 23, 17, 0));
        RaceSchedule rs9 = new RaceSchedule("Chung kết Thu 2025", LocalDate.of(2025, 8, 24), "Trường đua Sóc Sơn", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2025, 8, 24, 15, 0), LocalDateTime.of(2025, 8, 24, 17, 0));

        RaceSchedule rs10 = new RaceSchedule("Bán kết 1 Đông 2025", LocalDate.of(2025, 11, 7), "Trường đua Đại Nam", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2025, 11, 7, 15, 0), LocalDateTime.of(2025, 11, 7, 17, 0));
        RaceSchedule rs11 = new RaceSchedule("Bán kết 2 Đông 2025", LocalDate.of(2025, 11, 8), "Trường đua Đại Nam", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2025, 11, 8, 15, 0), LocalDateTime.of(2025, 11, 8, 17, 0));
        RaceSchedule rs12 = new RaceSchedule("Chung kết Đông 2025", LocalDate.of(2025, 11, 9), "Trường đua Đại Nam", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2025, 11, 9, 15, 0), LocalDateTime.of(2025, 11, 9, 17, 0));

        RaceSchedule rs13 = new RaceSchedule("Bán kết 1 Quốc gia 2025", LocalDate.of(2025, 12, 27), "Trường đua Phú Thọ", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2025, 12, 27, 15, 0), LocalDateTime.of(2025, 12, 27, 17, 0));
        RaceSchedule rs14 = new RaceSchedule("Bán kết 2 Quốc gia 2025", LocalDate.of(2025, 12, 28), "Trường đua Phú Thọ", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2025, 12, 28, 15, 0), LocalDateTime.of(2025, 12, 28, 17, 0));
        RaceSchedule rs15 = new RaceSchedule("Chung kết Quốc gia 2025", LocalDate.of(2025, 12, 29), "Trường đua Phú Thọ", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2025, 12, 29, 15, 0), LocalDateTime.of(2025, 12, 29, 17, 0));

        RaceSchedule rs16 = new RaceSchedule("Bán kết 1 Xuân 2026", LocalDate.of(2026, 2, 12), "Trường đua Đại Nam", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2026, 2, 12, 15, 0), LocalDateTime.of(2026, 2, 12, 17, 0));
        RaceSchedule rs17 = new RaceSchedule("Bán kết 2 Xuân 2026", LocalDate.of(2026, 2, 13), "Trường đua Đại Nam", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2026, 2, 13, 15, 0), LocalDateTime.of(2026, 2, 13, 17, 0));
        RaceSchedule rs18 = new RaceSchedule("Chung kết Xuân 2026", LocalDate.of(2026, 2, 14), "Trường đua Đại Nam", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2026, 2, 14, 15, 0), LocalDateTime.of(2026, 2, 14, 17, 0));

        RaceSchedule rs19 = new RaceSchedule("Bán kết 1 Hè 2026", LocalDate.of(2026, 5, 17), "Trường đua Phú Thọ", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2026, 5, 17, 15, 0), LocalDateTime.of(2026, 5, 17, 17, 0));
        RaceSchedule rs20 = new RaceSchedule("Bán kết 2 Hè 2026", LocalDate.of(2026, 5, 18), "Trường đua Phú Thọ", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2026, 5, 18, 15, 0), LocalDateTime.of(2026, 5, 18, 17, 0));
        RaceSchedule rs21 = new RaceSchedule("Chung kết Hè 2026", LocalDate.of(2026, 5, 19), "Trường đua Phú Thọ", RaceScheduleStatus.COMPLETED, LocalDateTime.of(2026, 5, 19, 15, 0), LocalDateTime.of(2026, 5, 19, 17, 0));

        RaceSchedule rs22 = new RaceSchedule("Bán kết 1 Thu 2026", LocalDate.of(2026, 8, 22), "Trường đua Sóc Sơn", RaceScheduleStatus.PENDING, LocalDateTime.of(2026, 8, 22, 15, 0), LocalDateTime.of(2026, 8, 22, 17, 0));
        RaceSchedule rs23 = new RaceSchedule("Bán kết 2 Thu 2026", LocalDate.of(2026, 8, 23), "Trường đua Sóc Sơn", RaceScheduleStatus.PENDING, LocalDateTime.of(2026, 8, 23, 15, 0), LocalDateTime.of(2026, 8, 23, 17, 0));
        RaceSchedule rs24 = new RaceSchedule("Chung kết Thu 2026", LocalDate.of(2026, 8, 24), "Trường đua Sóc Sơn", RaceScheduleStatus.PENDING, LocalDateTime.of(2026, 8, 24, 15, 0), LocalDateTime.of(2026, 8, 24, 17, 0));

        RaceSchedule rs25 = new RaceSchedule("Bán kết 1 Đông 2026", LocalDate.of(2026, 11, 7), "Trường đua Đại Nam", RaceScheduleStatus.PENDING, LocalDateTime.of(2026, 11, 7, 15, 0), LocalDateTime.of(2026, 11, 7, 17, 0));
        RaceSchedule rs26 = new RaceSchedule("Bán kết 2 Đông 2026", LocalDate.of(2026, 11, 8), "Trường đua Đại Nam", RaceScheduleStatus.PENDING, LocalDateTime.of(2026, 11, 8, 15, 0), LocalDateTime.of(2026, 11, 8, 17, 0));
        RaceSchedule rs27 = new RaceSchedule("Chung kết Đông 2026", LocalDate.of(2026, 11, 9), "Trường đua Đại Nam", RaceScheduleStatus.PENDING, LocalDateTime.of(2026, 11, 9, 15, 0), LocalDateTime.of(2026, 11, 9, 17, 0));

        RaceSchedule rs28 = new RaceSchedule("Bán kết 1 Quốc gia 2026", LocalDate.of(2026, 12, 27), "Trường đua Phú Thọ", RaceScheduleStatus.PENDING, LocalDateTime.of(2026, 12, 27, 15, 0), LocalDateTime.of(2026, 12, 27, 17, 0));
        RaceSchedule rs29 = new RaceSchedule("Bán kết 2 Quốc gia 2026", LocalDate.of(2026, 12, 28), "Trường đua Phú Thọ", RaceScheduleStatus.PENDING, LocalDateTime.of(2026, 12, 28, 15, 0), LocalDateTime.of(2026, 12, 28, 17, 0));
        RaceSchedule rs30 = new RaceSchedule("Chung kết Quốc gia 2026", LocalDate.of(2026, 12, 29), "Trường đua Phú Thọ", RaceScheduleStatus.PENDING, LocalDateTime.of(2026, 12, 29, 15, 0), LocalDateTime.of(2026, 12, 29, 17, 0));






    }





}
