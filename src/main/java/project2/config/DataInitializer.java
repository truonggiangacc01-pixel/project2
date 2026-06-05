package project2.config;


import org.springframework.beans.factory.BeanRegistry;
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
import java.time.LocalTime;
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
        Admin ad1 = new Admin("tranvan_admin", "ad123", "tranavan.admin@duangua.vn");
        Admin ad2 = new Admin("lehoang_admin", "ad123", "lehoang.admin@duangua.vn");
        Admin ad3 = new Admin("phamthinh-admin", "ad123", "phamthinh.admin@duangua.vn");
        Admin ad4 = new Admin("nguyenbich_admin", "ad123", "nguyenbich.admin@duangua.vn");
        Admin ad5 = new Admin("tranduong_admin", "ad123", "tranduong.admin@duangua.vn");



        /*___________________________________________________________________________________________________________ */
        //                                                  SPECTATOR
        Spectator spec1 = new Spectator("khangia_tuan", "tuankh@gmail.com", "spec123");
        Spectator spec2 = new Spectator("yeuthethao99", "thethao99@gmail.com", "spec123");
        Spectator spec3 = new Spectator("ngoclinh_fan", "ngoclinh@gmail.com", "spec123");
        Spectator spec4 = new Spectator("huyhoang_bet", "huyhoang@gmail.com", "spec123");
        Spectator spec5 = new Spectator("mai_phuong22", "phuongmai@gmail.com", "spec123");
        Spectator spec6 = new Spectator("thantai_den", "thantai@gmail.com", "spec123");
        Spectator spec7 = new Spectator("quocbao_88", "quocbao88@gmail.com", "spec123");
        Spectator spec8 = new Spectator("minhhang_vip", "minhhang@gmail.com", "spec123");
        Spectator spec9 = new Spectator("trandung_win", "trandung@gmail.com", "spec123");
        Spectator spec10 = new Spectator("lelan_smile", "lelan@gmail.com", "spec123");


        /*___________________________________________________________________________________________________________ */
        //                                                  HORSE OWNER
        HorseOwner ho1 = new HorseOwner("Lý Gia Thành", "ThanhLGT", "0901112233", "ho123", "giathanh.owner@gmail.com");
        HorseOwner ho2 = new HorseOwner("Trương Đại Lộc", "LocTĐL", "0902223344", "ho123", "dailoc.owner@gmail.com");
        HorseOwner ho3 = new HorseOwner("Trần Phú Qúy", "QuyTPQ", "0903334455", "ho123", "phuquy.owner@gmail.com");
        HorseOwner ho4 = new HorseOwner("Nguyễn Tài Phát", "PhatNTP", "0904445566", "ho123", "taiphat.owner@gmail.com");


        /*___________________________________________________________________________________________________________ */
        //                                                  JOCKEY
        Jockey joc1 = new Jockey("Trần Kỵ Thương", "ThuongTKT", 25, 4, "0981112233", "Jock123");
        Jockey joc2 = new Jockey("Lê Bá Vũ", "VuLBV", 29, 8, "0982223344", "Jock123");
        Jockey joc3 = new Jockey("Nguyễn Phi Trường", "TruongNPT", 24, 3, "0983334455", "Jock123");
        Jockey joc4 = new Jockey("Phạm Dũng Cảm", "CamPDC", 32, 10, "0984445566", "Jock123");
        Jockey joc5 = new Jockey("Đinh Thần Tốc", "TocĐTT", 27, 6, "0985556677", "Jock123");
        Jockey joc6 = new Jockey("Vũ Phong Nhã", "NhaVPN", 26, 5, "0986667788", "Jock123");
        Jockey joc7 = new Jockey("Hồ Quang Uy", "UyHQU", 30, 9, "0987778899", "Jock123");
        Jockey joc8 = new Jockey("Lý Phi Long", "LongLPL", 23, 2, "0988889900", "Jock123");

        /*
        Jockey joc9 = new Jockey("Cao Vạn Dặm",       "DamCVD",     28, 7, "0989990011", "Jock123");
        Jockey joc10= new Jockey("Bùi Uy Dũng",       "DungBUD",    31, 11,"0981001122", "Jock123");

         */



        /*___________________________________________________________________________________________________________ */
        //                                                  RACE REFEREE
        RaceReferee ref1 = new RaceReferee("Lương Công Bằng", "BangLCB", "0911112233", "RaRe123", "congbang.ref@mail.com");
        RaceReferee ref2 = new RaceReferee("Trịnh Chính Trực", "TrucTCT", "0912223344", "RaRe123", "chinhtruc.ref@mail.com");
        RaceReferee ref3 = new RaceReferee("Tạ Khách Quan", "QuanTKQ", "0913334455", "RaRe123", "khachquan.ref@mail.com");
        RaceReferee ref4 = new RaceReferee("Võ Minh Bạch", "AchVMB", "0914445566", "RaRe123", "minhbach.ref@mail.com");
        RaceReferee ref5 = new RaceReferee("Đào Công Tâm", "AmĐCT", "0915556677", "RaRe123", "congtam.ref@mail.com");
        RaceReferee ref6 = new RaceReferee("Phan Trung Lập", "LapPTL", "0916667788", "RaRe123", "trunglap.ref@mail.com");
        RaceReferee ref7 = new RaceReferee("Bùi Đức Minh", "InhBĐM", "0917778899", "RaRe123", "duicminh.ref@mail.com");
        RaceReferee ref8 = new RaceReferee("Đoàn Quang Sang", "SangĐQS", "0918889900", "RaRe123", "quangsang.ref@mail.com");
        RaceReferee ref9 = new RaceReferee("Chu Uy Nghiêm", "IemCUN", "0919990011", "RaRe123", "uynghiem.ref@mail.com");
        RaceReferee ref10 = new RaceReferee("Lâm Quyết Đoán", "DoanLQĐ", "0911001122", "RaRe123", "quyetdoan.ref@mail.com");



        /*___________________________________________________________________________________________________________ */
        //                                                  HORSE
        Horse h1 = new Horse("Bão Táp", 4, "Thoroughbred", "Khỏe mạnh");
        Horse h2 = new Horse("Sấm Sét", 5, "Quarter Horse", "Khỏe mạnh");
        Horse h3 = new Horse("Xích Thố", 3, "Arabian", "Khỏe mạnh");
        Horse h4 = new Horse("Bạch Mã", 6, "Thoroughbred", "Đang hồi phục");
        Horse h5 = new Horse("Phi Yến", 4, "Appaloosa", "Khỏe mạnh");
        Horse h6 = new Horse("Hắc Ám", 5, "Thoroughbred", "Chấn thương nhẹ");
        Horse h7 = new Horse("Tia Chớp", 3, "Quarter Horse", "Khỏe mạnh");
        Horse h8 = new Horse("Đại Bàng", 7, "Arabian", "Khỏe mạnh");


        /*___________________________________________________________________________________________________________ */
        //                                                  TOURNAMENT

        Tournament tour1 = new Tournament("Giải Vô Địch Quốc Gia 2025", "Trường đua Phú Thọ", LocalDate.of(2025, 12, 20), LocalDate.of(2025, 12, 25));
        Tournament tour2 = new Tournament("Giải Đua Ngựa Khai Xuân 2026", "Trường đua Đại Nam", LocalDate.of(2026, 2, 10), LocalDate.of(2026, 2, 15));
        Tournament tour3 = new Tournament("Giải Đua Ngựa Đón Hè 2026", "Trường đua Phú Thọ", LocalDate.of(2026, 5, 15), LocalDate.of(2026, 5, 20));
        Tournament tour4 = new Tournament("Giải Đua Ngựa Vượt Thu 2026", "Trường đua Sóc Sơn", LocalDate.of(2026, 8, 20), LocalDate.of(2026, 8, 25));
        Tournament tour5 = new Tournament("Giải Đua Ngựa Chinh Đông 2026", "Trường đua Đại Nam", LocalDate.of(2026, 11, 5), LocalDate.of(2026, 11, 10));
        Tournament tour6 = new Tournament("Giải Vô Địch Quốc Gia 2026", "Trường đua Phú Thọ", LocalDate.of(2026, 12, 20), LocalDate.of(2026, 12, 25));





        /*___________________________________________________________________________________________________________ */
        //                                                  PRIZE
        Prize p1 = new Prize("Giải Nhất", BigDecimal.valueOf(2500000000.00), 1);
        Prize p2 = new Prize("Giải Nhì", BigDecimal.valueOf(1375000000.00), 2);
        Prize p3 = new Prize("Giải Ba", BigDecimal.valueOf(937500000.00), 3);
        Prize p4 = new Prize("Giải Tư", BigDecimal.valueOf(562500000.00), 4);
        Prize p5 = new Prize("Giải Năm", BigDecimal.valueOf(375000000.00), 5);
        Prize p6 = new Prize("Giải Sáu", BigDecimal.valueOf(375000000.00), 6);
        Prize p7 = new Prize("Giải Bảy", BigDecimal.valueOf(375000000.00), 7);
        Prize p8 = new Prize("Giải Tám", BigDecimal.valueOf(375000000.00), 8);

        /*___________________________________________________________________________________________________________ */
        //                                                  TICKET

        //tour1, spec1, spec2
        Ticket t1 = new Ticket(BigDecimal.valueOf(200000), LocalDateTime.of(2025, 12, 16, 11, 45), TicketStatus.USED);
        Ticket t2 = new Ticket(BigDecimal.valueOf(200000), LocalDateTime.of(2025, 12, 17, 11, 45), TicketStatus.USED);

        //tour2, spec3, spec4
        Ticket t3 = new Ticket(BigDecimal.valueOf(100000), LocalDateTime.of(2026, 2, 1, 9, 0), TicketStatus.USED);
        Ticket t4 = new Ticket(BigDecimal.valueOf(100000), LocalDateTime.of(2026, 2, 2, 9, 0), TicketStatus.CANCELLED);

        //tour3, spec5, spec6
        Ticket t5 = new Ticket(BigDecimal.valueOf(150000), LocalDateTime.of(2026, 5, 12, 14, 30), TicketStatus.USED);
        Ticket t6 = new Ticket(BigDecimal.valueOf(150000), LocalDateTime.of(2026, 5, 13, 14, 30), TicketStatus.USED);

        //tour4, spec7, spec8
        Ticket t7 = new Ticket(BigDecimal.valueOf(120000), LocalDateTime.of(2026, 8, 11, 10, 15), TicketStatus.SOLD);
        Ticket t8 = new Ticket(BigDecimal.valueOf(120000), LocalDateTime.of(2026, 8, 11, 10, 15), TicketStatus.SOLD);

        //tour5, spec9, spec10
        Ticket t9 = new Ticket(BigDecimal.valueOf(120000), LocalDateTime.of(2026, 11, 1, 16, 0), TicketStatus.SOLD);
        Ticket t10 = new Ticket(BigDecimal.valueOf(120000), LocalDateTime.of(2026, 11, 2, 16, 0), TicketStatus.SOLD);

        //tour6, spec1, spec2
        Ticket t11 = new Ticket(BigDecimal.valueOf(200000), LocalDateTime.of(2026, 12, 16, 11, 45), TicketStatus.SOLD);
        Ticket t12 = new Ticket(BigDecimal.valueOf(200000), LocalDateTime.of(2026, 12, 17, 11, 45), TicketStatus.SOLD);



        /*___________________________________________________________________________________________________________ */
        //                                                  RACE SCHEDULE

        RaceSchedule rasc1 = new RaceSchedule(
                "Bán kết Quốc gia 2025 lần 1",
                LocalDate.of(2025, 12, 22),
                "Trường đua Phú Thọ",
                RaceScheduleStatus.COMPLETED,
                LocalDateTime.of(2025, 12, 22, 15, 0, 0),
                LocalDateTime.of(2025, 12, 22, 17, 0, 0)
        );


        RaceSchedule rasc2 = new RaceSchedule(
                "Bán kết Quốc gia 2025 lần 2",
                LocalDate.of(2025, 12, 23),
                "Trường đua Phú Thọ",
                RaceScheduleStatus.COMPLETED,
                LocalDateTime.of(2025, 12, 23, 15, 0, 0),
                LocalDateTime.of(2025, 12, 23, 17, 0, 0)
        );


        RaceSchedule rasc3 = new RaceSchedule(
                "Chung kết Quốc gia 2025",
                LocalDate.of(2025, 12, 24),
                "Trường đua Phú Thọ",
                RaceScheduleStatus.COMPLETED,
                LocalDateTime.of(2025, 12, 24, 15, 0, 0),
                LocalDateTime.of(2025, 12, 24, 17, 0, 0)
        );


        RaceSchedule rasc4 = new RaceSchedule(
                "Chung kết Xuân 2026",
                LocalDate.of(2026, 2, 14),
                "Trường đua Đại Nam",
                RaceScheduleStatus.COMPLETED,
                LocalDateTime.of(2026, 2, 14, 15, 0, 0),
                LocalDateTime.of(2026, 2, 14, 17, 0, 0)
        );


        RaceSchedule rasc5 = new RaceSchedule(
                "Chung kết Hè 2026",
                LocalDate.of(2026, 5, 19),
                "Trường đua Phú Thọ",
                RaceScheduleStatus.COMPLETED,
                LocalDateTime.of(2026, 5, 19, 15, 0, 0),
                LocalDateTime.of(2026, 5, 19, 17, 0, 0)
        );


        RaceSchedule rasc6 = new RaceSchedule(
                "Chung kết Thu 2026",
                LocalDate.of(2026, 8, 24),
                "Trường đua Sóc Sơn",
                RaceScheduleStatus.PENDING,
                LocalDateTime.of(2026, 8, 24, 15, 0, 0),
                LocalDateTime.of(2026, 8, 24, 17, 0, 0)
        );


        RaceSchedule rasc7 = new RaceSchedule(
                "Chung kết Đông 2026",
                LocalDate.of(2026, 11, 9),
                "Trường đua Đại Nam",
                RaceScheduleStatus.PENDING,
                LocalDateTime.of(2026, 11, 9, 15, 0, 0),
                LocalDateTime.of(2026, 11, 9, 17, 0, 0)
        );


        RaceSchedule rasc8 = new RaceSchedule(
                "Bán kết Quốc gia 2026 lần 1",
                LocalDate.of(2026, 12, 22),
                "Trường đua Phú Thọ",
                RaceScheduleStatus.PENDING,
                LocalDateTime.of(2026, 12, 22, 15, 0, 0),
                LocalDateTime.of(2026, 12, 22, 17, 0, 0)
        );


        RaceSchedule rasc9 = new RaceSchedule(
                "Bán kết Quốc gia 2026 lần 2",
                LocalDate.of(2026, 12, 23),
                "Trường đua Phú Thọ",
                RaceScheduleStatus.PENDING,
                LocalDateTime.of(2026, 12, 23, 15, 0, 0),
                LocalDateTime.of(2026, 12, 23, 17, 0, 0)
        );


        RaceSchedule rasc10 = new RaceSchedule(
                "Chung kết Quốc gia 2026",
                LocalDate.of(2026, 12, 24),
                "Trường đua Phú Thọ",
                RaceScheduleStatus.PENDING,
                LocalDateTime.of(2026, 12, 24, 15, 0, 0),
                LocalDateTime.of(2026, 12, 24, 17, 0, 0)
        );


        /*___________________________________________________________________________________________________________ */
        //                                                  RACE PARITIPATION

        /*A - B - C */ //tham chiếu đến RaceScheduleId - HorseId - JockeyId

        //Bán kết Quốc gia 2025 lần 1
        /*1 - 1 - 1*/
        RaceParticipation rapa1 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 1);
        /*1 - 2 - 2*/
        RaceParticipation rapa2 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 2);
        /*1 - 3 - 3*/
        RaceParticipation rapa3 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 3);
        /*1 - 4 - 4*/
        RaceParticipation rapa4 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 4);

        //Bán kết Quốc gia 2025 lần 2
        /*2 - 5 - 5*/
        RaceParticipation rapa5 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 1);
        /*2 - 6 - 6*/
        RaceParticipation rapa6 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 2);
        /*2 - 7 - 7*/
        RaceParticipation rapa7 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 3);
        /*2 - 8 - 8*/
        RaceParticipation rapa8 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 4);

        //Chung kết Quốc gia 2025
        /*3 - 1 - 1*/
        RaceParticipation rapa9 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 1);
        /*3 - 2 - 2*/
        RaceParticipation rapa10 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 2);
        /*3 - 5 - 5*/
        RaceParticipation rapa11 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 3);
        /*3 - 6 - 6*/
        RaceParticipation rapa12 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 4);

        //Chung kết Xuân 2026
        /*4 - 1 - 1*/
        RaceParticipation rapa13 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 1);
        /*4 - 2 - 2*/
        RaceParticipation rapa14 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 2);
        /*4 - 3 - 3*/
        RaceParticipation rapa15 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 3);
        /*4 - 4 - 4*/
        RaceParticipation rapa16 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 4);

        //Chung kết Hè 2026
        /*5 - 5 - 5*/
        RaceParticipation rapa17 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 1);
        /*5 - 6 - 6*/
        RaceParticipation rapa18 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 2);
        /*5 - 7 - 7*/
        RaceParticipation rapa19 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 3);
        /*5 - 8 - 8*/
        RaceParticipation rapa20 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 4);

        //Chung kết Thu 2026
        /*6 - 1 - 1*/
        RaceParticipation rapa21 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 1);
        /*6 - 2 - 2*/
        RaceParticipation rapa22 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 2);
        /*6 - 3 - 3*/
        RaceParticipation rapa23 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 3);
        /*6 - 4 - 4*/
        RaceParticipation rapa24 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 4);

        //Chung kết Đông 2026
        /*7 - 1 - 1*/
        RaceParticipation rapa25 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 1);
        /*7 - 2 - 2*/
        RaceParticipation rapa26 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 2);
        /*7 - 3 - 3*/
        RaceParticipation rapa27 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 3);
        /*7 - 4 - 4*/
        RaceParticipation rapa28 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 4);

        //Bán kết Quốc gia 2026 lần 1
        /*8 - 1 - 1*/
        RaceParticipation rapa29 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 1);
        /*8 - 2 - 2*/
        RaceParticipation rapa30 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 2);
        /*8 - 3 - 3*/
        RaceParticipation rapa31 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 3);
        /*8 - 4 - 4*/
        RaceParticipation rapa32 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 4);

        //Bán kết Quốc gia 2026 lần 2
        /*9 - 5 - 5*/
        RaceParticipation rapa33 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 1);
        /*9 - 6 - 6*/
        RaceParticipation rapa34 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 2);
        /*9 - 7 - 7*/
        RaceParticipation rapa35 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 3);
        /*9 - 8 - 8*/
        RaceParticipation rapa36 = new RaceParticipation(RaceParticipationStatus.CONFIRMED, 4);



        /*___________________________________________________________________________________________________________ */
        //                                                  RACE RESULT
        /*A - B - C */ //tham chiếu đến RaceScheduleId - RaceRefereeId - RaceParticipationId

        //Bán kết Quốc gia 2025 lần 1
        /*1 - 1 - 1*/
        RaceResult rare1 = new RaceResult(1, LocalTime.of(0, 4, 50, 120_000_000), RaceResultStatus.OFFICIAL);
        /*1 - 1 - 2*/
        RaceResult rare2 = new RaceResult(2, LocalTime.of(0, 4, 50, 350_000_000), RaceResultStatus.OFFICIAL);
        /*1 - 1 - 3*/
        RaceResult rare3 = new RaceResult(3, LocalTime.of(0, 4, 51, 140_000_000), RaceResultStatus.OFFICIAL);
        /*1 - 1 - 4*/
        RaceResult rare4 = new RaceResult(4, LocalTime.of(0, 4, 55, 150_000_000), RaceResultStatus.OFFICIAL);

        //Bán kết Quốc gia 2025 lần 2
        /*2 - 2 - 5*/
        RaceResult rare5 = new RaceResult(4, LocalTime.of(0, 5, 55, 150_000_000), RaceResultStatus.OFFICIAL);
        /*2 - 2 - 6*/
        RaceResult rare6 = new RaceResult(3, LocalTime.of(0, 5, 51, 140_000_000), RaceResultStatus.OFFICIAL);
        /*2 - 2 - 7*/
        RaceResult rare7 = new RaceResult(2, LocalTime.of(0, 5, 50, 350_000_000), RaceResultStatus.OFFICIAL);
        /*2 - 2 - 8*/
        RaceResult rare8 = new RaceResult(1, LocalTime.of(0, 5, 50, 120_000_000), RaceResultStatus.OFFICIAL);

        //Chung kết Quốc gia 2025
        /*3 - 3 - 9*/
        RaceResult rare9 = new RaceResult(2, LocalTime.of(0, 6, 50, 350_000_000), RaceResultStatus.OFFICIAL);
        /*3 - 3 - 10*/
        RaceResult rare10 = new RaceResult(3, LocalTime.of(0, 6, 51, 140_000_000), RaceResultStatus.OFFICIAL);
        /*3 - 3 - 11*/
        RaceResult rare11 = new RaceResult(4, LocalTime.of(0, 6, 55, 150_000_000), RaceResultStatus.OFFICIAL);
        /*3 - 3 - 12*/
        RaceResult rare12 = new RaceResult(1, LocalTime.of(0, 6, 50, 120_000_000), RaceResultStatus.OFFICIAL);

        //Chung kết Xuân 2026
        /*4 - 4 - 13*/
        RaceResult rare13 = new RaceResult(3, LocalTime.of(0, 5, 51, 140_000_000), RaceResultStatus.OFFICIAL);
        /*4 - 4 - 14*/
        RaceResult rare14 = new RaceResult(4, LocalTime.of(0, 5, 55, 150_000_000), RaceResultStatus.OFFICIAL);
        /*4 - 4 - 15*/
        RaceResult rare15 = new RaceResult(1, LocalTime.of(0, 5, 50, 120_000_000), RaceResultStatus.OFFICIAL);
        /*4 - 4 - 16*/
        RaceResult rare16 = new RaceResult(2, LocalTime.of(0, 5, 50, 350_000_000), RaceResultStatus.OFFICIAL);

        //Chung kết Hè 2026
        /*5 - 5 - 17*/
        RaceResult rare17 = new RaceResult(4, LocalTime.of(0, 6, 55, 150_000_000), RaceResultStatus.OFFICIAL);
        /*5 - 5 - 18*/
        RaceResult rare18 = new RaceResult(1, LocalTime.of(0, 6, 50, 120_000_000), RaceResultStatus.OFFICIAL);
        /*5 - 5 - 19*/
        RaceResult rare19 = new RaceResult(2, LocalTime.of(0, 6, 50, 350_000_000), RaceResultStatus.OFFICIAL);
        /*5 - 5 - 20*/
        RaceResult rare20 = new RaceResult(3, LocalTime.of(0, 6, 51, 140_000_000), RaceResultStatus.OFFICIAL);

        //Chung kết Thu 2026
        /*6 - 6 - 21*/
        RaceResult rare21 = new RaceResult(null, null, RaceResultStatus.UNOFFICIAL);
        /*6 - 6 - 22*/
        RaceResult rare22 = new RaceResult(null, null, RaceResultStatus.UNOFFICIAL);
        /*6 - 6 - 23*/
        RaceResult rare23 = new RaceResult(null, null, RaceResultStatus.UNOFFICIAL);
        /*6 - 6 - 24*/
        RaceResult rare24 = new RaceResult(null, null, RaceResultStatus.UNOFFICIAL);

        //Chung Kết Đông 2026
        /*7 - 7 - 25*/
        RaceResult rare25 = new RaceResult(null, null, RaceResultStatus.UNOFFICIAL);
        /*7 - 7 - 26*/
        RaceResult rare26 = new RaceResult(null, null, RaceResultStatus.UNOFFICIAL);
        /*7 - 7 - 27*/
        RaceResult rare27 = new RaceResult(null, null, RaceResultStatus.UNOFFICIAL);
        /*7 - 7 - 28*/
        RaceResult rare28 = new RaceResult(null, null, RaceResultStatus.UNOFFICIAL);

        //Bán kết Quốc gia 2026 lần 1
        /*8 - 8 - 29*/
        RaceResult rare29 = new RaceResult(null, null, RaceResultStatus.UNOFFICIAL);
        /*8 - 8 - 30*/
        RaceResult rare30 = new RaceResult(null, null, RaceResultStatus.UNOFFICIAL);
        /*8 - 8 - 31*/
        RaceResult rare31 = new RaceResult(null, null, RaceResultStatus.UNOFFICIAL);
        /*8 - 8 - 32*/
        RaceResult rare32 = new RaceResult(null, null, RaceResultStatus.UNOFFICIAL);

        //Bán kết Quốc gia 2026 lần 2
        /*9 - 9 - 33*/
        RaceResult rare33 = new RaceResult(null, null, RaceResultStatus.UNOFFICIAL);
        /*9 - 9 - 34*/
        RaceResult rare34 = new RaceResult(null, null, RaceResultStatus.UNOFFICIAL);
        /*9 - 9 - 35*/
        RaceResult rare35 = new RaceResult(null, null, RaceResultStatus.UNOFFICIAL);
        /*9 - 9 - 36*/
        RaceResult rare36 = new RaceResult(null, null, RaceResultStatus.UNOFFICIAL);



        /*___________________________________________________________________________________________________________ */
        //                                                  PREDICTION


        /*A - B - C */ //tham chiếu đến RaceScheduleId - HorseId - SpectatorId


        /*3 - 1 - 1*/
        Prediction pre1 = new Prediction(1, LocalDateTime.of(2025, 12, 16, 11, 45), PredictionStatus.WON);
        /*3 - 2 - 2*/
        Prediction pre2 = new Prediction(2, LocalDateTime.of(2025, 12, 17, 11, 45), PredictionStatus.LOST);
        /*4 - 3 - 3*/
        Prediction pre3 = new Prediction(3, LocalDateTime.of(2026, 2, 1, 9, 0), PredictionStatus.WON);
        /*4 - 4 - 4*/
        Prediction pre4 = new Prediction(4, LocalDateTime.of(2026, 2, 2, 9, 0), PredictionStatus.WON);
        /*5 - 7 - 5*/
        Prediction pre5 = new Prediction(5, LocalDateTime.of(2026, 5, 12, 14, 30), PredictionStatus.WON);
        /*5 - 8 - 6*/
        Prediction pre6 = new Prediction(6, LocalDateTime.of(2026, 5, 13, 14, 30), PredictionStatus.LOST);


        /*6 - 3 - 7*/
        Prediction pre7 = new Prediction(7, LocalDateTime.of(2026, 8, 11, 10, 15), PredictionStatus.PENDING);
        /*6 - 4 - 8*/
        Prediction pre8 = new Prediction(8, LocalDateTime.of(2026, 8, 12, 10, 15), PredictionStatus.PENDING);
        /*7 - 5 - 9*/
        Prediction pre9 = new Prediction(9, LocalDateTime.of(2026, 11, 1, 16, 0), PredictionStatus.PENDING);
        /*7 - 6 - 10*/
        Prediction pre10 = new Prediction(10, LocalDateTime.of(2026, 11, 1, 16, 0), PredictionStatus.PENDING);
        /*8 - 1 - 1*/
        Prediction pre11 = new Prediction(11, LocalDateTime.of(2026, 12, 16, 11, 45), PredictionStatus.PENDING);
        /*9 - 5 - 2*/
        Prediction pre12 = new Prediction(12, LocalDateTime.of(2026, 12, 17, 11, 45), PredictionStatus.PENDING);




        /*___________________________________________________________________________________________________________ */
        //                                                  NOTIFICATION


        /*___________________________________________________________________________________________________________ */
        //                                              LƯU Spectator

        List<Spectator> spectators = List.of(spec1, spec2, spec3, spec4, spec5, spec6, spec7, spec8, spec9, spec10);

        List<Spectator> savedSpectators = new ArrayList<>();

        for (Spectator spectator : spectators) {
            spectatorService.saveSpectator(spectator);
            savedSpectators.add(spectator);
        }

        /*___________________________________________________________________________________________________________ */
        //                                              LƯU Racereferee

        List<RaceReferee> raceReferees = List.of(ref1, ref2, ref3, ref4, ref5, ref6, ref7, ref8, ref9, ref10);

        List<RaceReferee> savedRaceReferees = new ArrayList<>();

        for (RaceReferee raceReferee : raceReferees) {
            raceRefereeService.saveRaceReferee(raceReferee);
            savedRaceReferees.add(raceReferee);
        }

        /*___________________________________________________________________________________________________________ */
        //                                              LƯU Jockey

        List<Jockey> jockeys = List.of(joc1, joc2, joc3, joc4, joc5, joc6, joc7, joc8);

        List<Jockey> savedJockeys = new ArrayList<>();

        for (Jockey jockey : jockeys) {
            jockeyService.saveJockey(jockey);
            savedJockeys.add(jockey);
        }

        /*___________________________________________________________________________________________________________ */
        //                                              LƯU HorseOwner

        List<HorseOwner> horseOwners = List.of(ho1, ho2, ho3, ho4);

        List<HorseOwner> savedHorseOwners = new ArrayList<>();

        for (HorseOwner horseOwner : horseOwners) {
            horseOwnerService.saveHorseOwner(horseOwner);
            savedHorseOwners.add(horseOwner);
        }

        /*___________________________________________________________________________________________________________ */
        //                                              LƯU Admin

        List<Admin> admins = List.of(ad1, ad2, ad3, ad4, ad5);

        List<Admin> savedAdmins = new ArrayList<>();

        for (Admin admin : admins) {
            adminService.saveAdmin(admin);
            savedAdmins.add(admin);
        }

        /*___________________________________________________________________________________________________________ */
        //                                              Gán savedHorseOwners vào Horse

        List<Horse> horses = List.of(h1, h2, h3, h4, h5, h6, h7, h8);

        List<Horse> savedHorses = new ArrayList<>();

        for (int i = 0; i < horses.size(); i++) {
            Horse currentHorse = horses.get(i);
            int ownerIndex = i / 2;
            ownerIndex = ownerIndex % savedHorseOwners.size();
            HorseOwner assignedOwner = savedHorseOwners.get(ownerIndex);
            currentHorse.setHorseOwner(assignedOwner);
            assignedOwner.addHorse(currentHorse);
            horseService.saveHorse(currentHorse);
            savedHorses.add(currentHorse);

        }
        /*___________________________________________________________________________________________________________ */
        //                                              Gán savedAdmins vào Tournament

        List<Tournament> tournaments = List.of(tour1, tour2, tour3, tour4, tour5, tour6);

        List<Tournament> savedTournaments = new ArrayList<>();

        for (int i = 0; i < tournaments.size(); i++) {
            Tournament currentTour = tournaments.get(i);
            Admin assignedAdmin = savedAdmins.get(i % savedAdmins.size());
            assignedAdmin.addTournament(currentTour);
            tournamentService.saveTournament(currentTour);
            savedTournaments.add(currentTour);
        }


        /*___________________________________________________________________________________________________________ */
        //                                              Gán savedTournaments vào RaceSchedule

        List<RaceSchedule> raceSchedules = List.of(rasc1, rasc2, rasc3, rasc4, rasc5, rasc6, rasc7, rasc8, rasc9, rasc10);

        List<RaceSchedule> savedRaceSchedules = new ArrayList<>();

        // tour1 (index 0) ôm rasc1, rasc2, rasc3
        savedTournaments.get(0).addRaceSchedule(rasc1);
        rasc1.setTournament(savedTournaments.get(0));
        savedTournaments.get(0).addRaceSchedule(rasc2);
        rasc2.setTournament(savedTournaments.get(0));
        savedTournaments.get(0).addRaceSchedule(rasc3);
        rasc3.setTournament(savedTournaments.get(0));

        // tour2 (index 1) ôm rasc4
        savedTournaments.get(1).addRaceSchedule(rasc4);
        rasc4.setTournament(savedTournaments.get(1));

        // tour3 (index 2) ôm rasc5
        savedTournaments.get(2).addRaceSchedule(rasc5);
        rasc5.setTournament(savedTournaments.get(2));

        // tour4 (index 3) ôm rasc6
        savedTournaments.get(3).addRaceSchedule(rasc6);
        rasc6.setTournament(savedTournaments.get(3));

        // tour5 (index 4) ôm rasc7
        savedTournaments.get(4).addRaceSchedule(rasc7);
        rasc7.setTournament(savedTournaments.get(4));

        // tour6 (index 5) ôm rasc8, rasc9, rasc10
        savedTournaments.get(5).addRaceSchedule(rasc8);
        rasc8.setTournament(savedTournaments.get(5));
        savedTournaments.get(5).addRaceSchedule(rasc9);
        rasc9.setTournament(savedTournaments.get(5));
        savedTournaments.get(5).addRaceSchedule(rasc10);
        rasc10.setTournament(savedTournaments.get(5));

        for (RaceSchedule raceSchedule : raceSchedules) {
            raceScheduleService.saveRaceSchedule(raceSchedule);
            savedRaceSchedules.add(raceSchedule);
        }

        /*___________________________________________________________________________________________________________ */
        //                                              Gán savedTournaments vào Prize

        List<Prize> savedPrizes = new ArrayList<>();

        String[] prizeNames = {"Giải Nhất", "Giải Nhì", "Giải Ba", "Giải Tư", "Giải Năm", "Giải Sáu", "Giải Bảy", "Giải Tám"};

        double[] prizeAmounts = {2500000000.0, 1375000000.0, 937500000.0, 562500000.0, 375000000.0, 375000000.0, 375000000.0, 375000000.0};

        // Vòng lặp duyệt qua từng Tournament
        for (int i = 0; i < savedTournaments.size(); i++) {
            Tournament currentTour = savedTournaments.get(i);

            // tour1 (index 0) và tour6 (index 5) có 8 giải, các tour còn lại có 4 giải
            int limit = (i == 0 || i == 5) ? 8 : 4;

            // Mỗi tour sẽ tự TẠO MỚI các giải thưởng của riêng nó
            for (int j = 0; j < limit; j++) {
                Prize newPrize = new Prize();
                newPrize.setName(prizeNames[j]);
                newPrize.setAmount(BigDecimal.valueOf(prizeAmounts[j])); // Hoặc kiểu dữ liệu tương ứng của bạn
                newPrize.setRankingRequired(j + 1);

                // Gán quan hệ
                newPrize.setTournament(currentTour);
                currentTour.addPrize(newPrize);

                // Lưu ngay vào database để lấy ID riêng biệt
                prizeService.savePrize(newPrize);
                savedPrizes.add(newPrize);
            }
        }

        /*___________________________________________________________________________________________________________ */
        //                                              Gán savedTournaments vào Ticket

        List<Ticket> tickets = List.of(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12);

        List<Ticket> savedTickets = new ArrayList<>();


        // Vòng lặp phân bổ và lưu Ticket
        for (int i = 0; i < tickets.size(); i++) {
            Ticket currentTicket = tickets.get(i);

            // Thuật toán lấy vị trí Tournament: i chia lấy nguyên cho 2 (i / 2)
            // Ví dụ:
            // i = 0 và i = 1 -> tourIndex = 0 -> lấy savedTournaments.get(0) (tour1)
            // i = 2 và i = 3 -> tourIndex = 1 -> lấy savedTournaments.get(1) (tour2)
            int tourIndex = i / 2;

            // Phòng hờ nếu số lượng ticket vượt quá số lượng tour để tránh lỗi IndexOutOfBounds
            tourIndex = tourIndex % savedTournaments.size();

            Tournament assignedTour = savedTournaments.get(tourIndex);

            // Gán mối quan hệ hai chiều để đảm bảo lưu đúng tournament_id xuống DB
            currentTicket.setTournament(assignedTour); // Bạn thêm dòng này nếu bảng Ticket cấu hình trường Tournament nhé
            assignedTour.addTicket(currentTicket);

            // Gọi hàm service (hàm void)
            ticketService.saveTicket(currentTicket);

            // Hứng vào list savedTickets để các bảng sau sử dụng
            savedTickets.add(currentTicket);
        }

        /*___________________________________________________________________________________________________________ */
        //                                              Gán savedSpectators vào Ticket

        // Giả định bạn đã có danh sách savedSpectators từ các bước trước (size = 12, từ spec1 đến spec12)
        // Và danh sách savedTickets vừa hứng được ở bước trên (size = 12, từ t1 đến t12)

        // Vòng lặp gán Ticket cho Spectator
        for (int i = 0; i < savedTickets.size(); i++) {
            Ticket currentTicket = savedTickets.get(i);

            // Vì tỷ lệ 1:1 nên index của Spectator khớp hoàn toàn với index của Ticket
            // Phòng trường hợp danh sách lệch size, ta dùng % để bọc lại cho an toàn
            int specIndex = i % savedSpectators.size();
            Spectator assignedSpec = savedSpectators.get(specIndex);

            // Gán mối quan hệ hai chiều
            assignedSpec.addTicket(currentTicket);
            currentTicket.setSpectator(assignedSpec); // Thêm dòng này nếu entity Ticket cần lưu trường Spectator (spec_id)

            // Do Ticket đã được save ở vòng lặp trước rồi, nên ở đây chúng ta sẽ gọi hàm save của Spectator
            // hoặc gọi hàm cập nhật Ticket tùy thuộc vào cách bạn cấu hình Cascade trong Entity.
            // Nếu bảng Ticket giữ khóa ngoại (spectator_id), ta cần lưu lại Ticket để cập nhật DB:
            ticketService.saveTicket(currentTicket);
        }


        /*___________________________________________________________________________________________________________ */
        //                                              Gán savedRaceSchedules vào RaceParticaption



        List<RaceParticipation> raceParticipations = List.of(rapa1, rapa2, rapa3, rapa4, rapa5, rapa6, rapa7, rapa8, rapa9, rapa10, rapa11, rapa12, rapa13, rapa14, rapa15, rapa16, rapa17, rapa18, rapa19, rapa20, rapa21, rapa22, rapa23, rapa24, rapa25, rapa26, rapa27, rapa28, rapa29, rapa30, rapa31, rapa32, rapa33, rapa34, rapa35, rapa36);

        List<RaceParticipation> savedRaceParticipations = new ArrayList<>();

        // Vòng lặp phân bổ và lưu RaceParticipation
        for (int i = 0; i < raceParticipations.size(); i++) {
            RaceParticipation currentRapa = raceParticipations.get(i);

            // Thuật toán lấy vị trí RaceSchedule: i chia lấy nguyên cho 4 (i / 4)
            // Ví dụ:
            // i = 0, 1, 2, 3   -> scheduleIndex = 0 -> lấy rasc1
            // i = 4, 5, 6, 7   -> scheduleIndex = 1 -> lấy rasc2
            // ...
            // i = 32, 33, 34, 35 -> scheduleIndex = 8 -> lấy rasc9
            int scheduleIndex = i / 4;

            // Phòng hờ kiểm soát index không vượt quá giới hạn danh sách
            if (scheduleIndex < savedRaceSchedules.size()) {
                RaceSchedule assignedSchedule = savedRaceSchedules.get(scheduleIndex);

                // Gán mối quan hệ hai chiều
                assignedSchedule.addRaceParticipation(currentRapa);
                currentRapa.setRaceSchedule(assignedSchedule); // Thêm dòng này nếu entity RaceParticipation có trường RaceSchedule
            }

            // Gọi hàm service dạng void để lưu vào DB
            raceParticipationService.saveRaceParticipation(currentRapa);

            // Hứng vào list savedRaceParticipations để sử dụng tiếp
            savedRaceParticipations.add(currentRapa);
        }

        /*___________________________________________________________________________________________________________ */
        //                                              Gán savedJockeys vào RaceParticipation

        // ĐỢT 1: rapa1 -> rapa8 (index 0 đến 7) - Sửa điều kiện i < 8
        for (int i = 0; i < 8; i++) {
            Jockey jockey = savedJockeys.get(i);
            RaceParticipation rapa = raceParticipations.get(i);

            jockey.addRaceParticipation(rapa);
            rapa.setJockey(jockey); // Gán chiều nghịch để map cột jockey_id
        }

        // ĐỢT 2: rapa9 -> rapa12 (index 8 đến 11)
        int[] jockeyDot2 = {0, 1, 4, 5};
        for (int i = 0; i < 4; i++) {
            Jockey jockey = savedJockeys.get(jockeyDot2[i]);
            RaceParticipation rapa = raceParticipations.get(8 + i);

            jockey.addRaceParticipation(rapa);
            rapa.setJockey(jockey); // Gán chiều nghịch
        }

        // ĐỢT 3: rapa13 -> rapa36 (index 12 đến 35)
        int jocIndex = 0;
        for (int i = 12; i < raceParticipations.size(); i++) {
            Jockey jockey = savedJockeys.get(jocIndex);
            RaceParticipation rapa = raceParticipations.get(i);

            jockey.addRaceParticipation(rapa);
            rapa.setJockey(jockey); // Gán chiều nghịch

            jocIndex++;
            if (jocIndex == 8) {
                jocIndex = 0;
            }
        }

        /*___________________________________________________________________________________________________________ */
        //                                              Gán savedHorses vào RaceParticipation

        // ĐỢT 1: rapa1 -> rapa8 (index 0 đến 7)
        for (int i = 0; i < 8; i++) {
            Horse horse = savedHorses.get(i);
            RaceParticipation rapa = raceParticipations.get(i);

            horse.addRaceParticipation(rapa);
            rapa.setHorse(horse); // Gán chiều nghịch để map cột horse_id
        }

        // ĐỢT 2: rapa9 -> rapa12 (index 8 đến 11)
        int[] horseDot2 = {0, 1, 4, 5};
        for (int i = 0; i < 4; i++) {
            Horse horse = savedHorses.get(horseDot2[i]);
            RaceParticipation rapa = raceParticipations.get(8 + i);

            horse.addRaceParticipation(rapa);
            rapa.setHorse(horse); // Gán chiều nghịch
        }

        // ĐỢT 3: rapa13 -> rapa36 (index 12 đến 35)
        int horseIndex = 0;
        for (int i = 12; i < raceParticipations.size(); i++) {
            Horse horse = savedHorses.get(horseIndex);
            RaceParticipation rapa = raceParticipations.get(i);

            horse.addRaceParticipation(rapa);
            rapa.setHorse(horse); // Gán chiều nghịch

            horseIndex++;
            if (horseIndex == 8) {
                horseIndex = 0;
            }
        }

        /*___________________________________________________________________________________________________________ */

        for (RaceParticipation rapa : raceParticipations) {
            // Gọi hàm service (hàm void) để cập nhật dữ liệu (bao gồm cả schedule_id đã gán ở bài trước, horse_id và jockey_id)
            raceParticipationService.saveRaceParticipation(rapa);

            // Đưa vào danh sách saved để làm các logic tiếp theo nếu cần
            savedRaceParticipations.add(rapa);
        }

        /*___________________________________________________________________________________________________________ */
        //                                              Gán savedRaceSchedules vào RaceResult

        //List<RaceSchedule> raceSchedules = List.of(rasc1, rasc2, rasc3, rasc4, rasc5, rasc6, rasc7, rasc8, rasc9, rasc10);

        List<RaceResult> raceResults = List.of(rare1, rare2, rare3, rare4, rare5, rare6, rare7, rare8, rare9, rare10, rare11, rare12, rare13, rare14, rare15, rare16, rare17, rare18, rare19, rare20, rare21, rare22, rare23, rare24, rare25, rare26, rare27, rare28, rare29, rare30, rare31, rare32, rare33, rare34, rare35, rare36);

        for (int i = 0; i < raceResults.size(); i++) {
            RaceResult currentRare = raceResults.get(i);

            // Thuật toán lấy vị trí RaceSchedule bằng phép chia lấy nguyên cho 4
            int scheduleIndex = i / 4;

            // Kiểm tra bảo vệ index không vượt quá độ dài danh sách lịch trình
            if (scheduleIndex < savedRaceSchedules.size()) {
                RaceSchedule assignedSchedule = savedRaceSchedules.get(scheduleIndex);

                // 1. Gán quan hệ 2 chiều (Cực kỳ quan trọng để không bị NULL khóa ngoại ở DB)
                assignedSchedule.addRaceResult(currentRare);
                currentRare.setRaceSchedule(assignedSchedule); // Thêm dòng này nếu entity RaceResult giữ trường RaceSchedule
            }

            // 2. Gọi hàm service (hàm void) để lưu trực tiếp vào Database
            raceResultService.saveRaceResult(currentRare);

        }

        /*___________________________________________________________________________________________________________ */
        //                                              Gán savedRaceReferees vào RaceResult

        //List<RaceReferee> raceReferees = List.of(ref1, ref2, ref3, ref4, ref5, ref6, ref7, ref8, ref9, ref10);

        //List<RaceResult> raceResults = List.of(rare1, rare2, rare3, rare4, rare5, rare6, rare7, rare8, rare9, rare10, rare11, rare12, rare13, rare14, rare15, rare16, rare17, rare18, rare19, rare20, rare21, rare22, rare23, rare24, rare25, rare26, rare27, rare28, rare29, rare30, rare31, rare32, rare33, rare34, rare35, rare36);

        for (int i = 0; i < raceResults.size(); i++) {
            RaceResult currentRare = raceResults.get(i);

            // Phép chia lấy nguyên cho 4 để gom cụm 4 kết quả cho 1 trọng tài
            int refereeIndex = i / 4;

            // Kiểm tra giới hạn để bảo vệ index không vượt quá danh sách trọng tài
            if (refereeIndex < savedRaceReferees.size()) {
                RaceReferee assignedReferee = savedRaceReferees.get(refereeIndex);

                // Gán mối quan hệ hai chiều để đảm bảo cột khóa ngoại (referee_id) được điền đầy đủ
                assignedReferee.addRaceResult(currentRare);
                currentRare.setRaceReferee(assignedReferee); // Thêm dòng này nếu entity RaceResult cấu hình trường RaceReferee
            }

            // Gọi hàm service (hàm void) để lưu trực tiếp, không cần tạo list hứng dữ liệu nữa
            raceResultService.saveRaceResult(currentRare);
        }


        /*___________________________________________________________________________________________________________ */
        //                                              Gán savedRaceParticipations vào RaceResult

        // Giả định bạn đã có danh sách savedRaceParticipations (size = 36) từ các bước trước
        // Và danh sách raceResults (size = 36)

        // Vòng lặp gán RaceParticipation vào RaceResult theo tỷ lệ 1:1
        for (int i = 0; i < raceResults.size(); i++) {
            RaceResult currentRare = raceResults.get(i);

            // Lấy RaceParticipation có cùng vị trí index
            RaceParticipation assignedRapa = savedRaceParticipations.get(i);

            // Gán mối quan hệ hai chiều để đảm bảo map trúng khóa ngoại xuống database
            //assignedRapa.setRaceResult(currentRare); // Thêm dòng này nếu entity RaceParticipation giữ trường RaceResult
            currentRare.setRaceParticipation(assignedRapa); // Thêm dòng này nếu entity RaceResult giữ trường RaceParticipation

            // Gọi hàm service (hàm void) để lưu/cập nhật trực tiếp xuống database
            raceResultService.saveRaceResult(currentRare);
        }

        /*___________________________________________________________________________________________________________ */
        //                                              Gán savedRaceSchedules vào Prediction

        List<Prediction> predictions = List.of(pre1, pre2, pre3, pre4, pre5, pre6, pre7, pre8, pre9, pre10, pre11, pre12);

        savedRaceSchedules.get(2).addPrediction(pre1);
        pre1.setRaceSchedule(savedRaceSchedules.get(2));
        savedRaceSchedules.get(2).addPrediction(pre2);
        pre2.setRaceSchedule(savedRaceSchedules.get(2));

        // rasc4 (index 3) ôm pre3, pre4
        savedRaceSchedules.get(3).addPrediction(pre3);
        pre3.setRaceSchedule(savedRaceSchedules.get(3));
        savedRaceSchedules.get(3).addPrediction(pre4);
        pre4.setRaceSchedule(savedRaceSchedules.get(3));

        // rasc5 (index 4) ôm pre5, pre6
        savedRaceSchedules.get(4).addPrediction(pre5);
        pre5.setRaceSchedule(savedRaceSchedules.get(4));
        savedRaceSchedules.get(4).addPrediction(pre6);
        pre6.setRaceSchedule(savedRaceSchedules.get(4));

        // rasc6 (index 5) ôm pre7, pre8
        savedRaceSchedules.get(5).addPrediction(pre7);
        pre7.setRaceSchedule(savedRaceSchedules.get(5));
        savedRaceSchedules.get(5).addPrediction(pre8);
        pre8.setRaceSchedule(savedRaceSchedules.get(5));

        // rasc7 (index 6) ôm pre9, pre10
        savedRaceSchedules.get(6).addPrediction(pre9);
        pre9.setRaceSchedule(savedRaceSchedules.get(6));
        savedRaceSchedules.get(6).addPrediction(pre10);
        pre10.setRaceSchedule(savedRaceSchedules.get(6));

        // rasc8 (index 7) ôm pre11
        savedRaceSchedules.get(7).addPrediction(pre11);
        pre11.setRaceSchedule(savedRaceSchedules.get(7));

        // rasc9 (index 8) ôm pre12
        savedRaceSchedules.get(8).addPrediction(pre12);
        pre12.setRaceSchedule(savedRaceSchedules.get(8));


    // --- VÒNG LẶP TỰ ĐỘNG SAVE XUỐNG DATABASE ---
        for (Prediction prediction : predictions) {
            predictionService.savePrediction(prediction); // Hàm void của bạn
        }


        /*___________________________________________________________________________________________________________ */
        //                                              Gán savedSpectators vào Prediction

        // Vòng lặp xoay vòng Spectator để gán vào Prediction
        for (int i = 0; i < predictions.size(); i++) {
            Prediction currentPre = predictions.get(i);

            // Sử dụng toán tử % để tự động xoay vòng index của Spectator khi i vượt quá 9
            // Ví dụ:
            // i = 0 -> 0 % 10 = 0 -> spec1
            // i = 9 -> 9 % 10 = 9 -> spec10
            // i = 10 -> 10 % 10 = 0 -> Quay lại spec1
            // i = 11 -> 11 % 10 = 1 -> Quay lại spec2
            int specIndex = i % savedSpectators.size();
            Spectator assignedSpec = savedSpectators.get(specIndex);

            // Gán mối quan hệ hai chiều
            assignedSpec.addPrediction(currentPre);
            currentPre.setSpectator(assignedSpec); // Gán chiều nghịch để tránh bị NULL cột spectator_id trong DB

            // Gọi hàm lưu/cập nhật trực tiếp xuống database (hàm void)
            predictionService.savePrediction(currentPre);
        }


        /*___________________________________________________________________________________________________________ */
        //                                              Gán savedHorse vào Prediction



        // pre1 -> h1 (index 0), pre2 -> h2 (index 1), pre3 -> h3 (index 2), pre4 -> h4 (index 3)
        pre1.setHorse(savedHorses.get(0));
        savedHorses.get(0).addPrediction(pre1);
        pre2.setHorse(savedHorses.get(1));
        savedHorses.get(1).addPrediction(pre2);
        pre3.setHorse(savedHorses.get(2));
        savedHorses.get(2).addPrediction(pre3);
        pre4.setHorse(savedHorses.get(3));
        savedHorses.get(3).addPrediction(pre4);

        // pre5 -> h7 (index 6), pre6 -> h8 (index 7), pre7 -> h3 (index 2), pre8 -> h4 (index 3)
        pre5.setHorse(savedHorses.get(6));
        savedHorses.get(6).addPrediction(pre5);
        pre6.setHorse(savedHorses.get(7));
        savedHorses.get(7).addPrediction(pre6);
        pre7.setHorse(savedHorses.get(2));
        savedHorses.get(2).addPrediction(pre7);
        pre8.setHorse(savedHorses.get(3));
        savedHorses.get(3).addPrediction(pre8);

        // pre9 -> h5 (index 4), pre10 -> h6 (index 5), pre11 -> h1 (index 0), pre12 -> h5 (index 4)
        pre9.setHorse(savedHorses.get(4));
        savedHorses.get(4).addPrediction(pre9);
        pre10.setHorse(savedHorses.get(5));
        savedHorses.get(5).addPrediction(pre10);
        pre11.setHorse(savedHorses.get(0));
        savedHorses.get(0).addPrediction(pre11);
        pre12.setHorse(savedHorses.get(4));
        savedHorses.get(4).addPrediction(pre12);


        // --- VÒNG LẶP LƯU HÀNG LOẠT XUỐNG DATABASE ---
        for (Prediction prediction : predictions) {
            // Gọi hàm service (hàm void) để cập nhật đầy đủ cả spectator_id, race_schedule_id và horse_id
            predictionService.savePrediction(prediction);
        }

    }


}