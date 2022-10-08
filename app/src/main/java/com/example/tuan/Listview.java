package com.example.tuan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Listview extends AppCompatActivity {

    ListView lvcauthu;
    ArrayList<Cauthu> arraycauthu;
    CauthuAdapter adapter;
    Button imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        Anhxa();

        adapter = new CauthuAdapter(this,R.layout.dong_cau_thu, arraycauthu);
        lvcauthu.setAdapter(adapter);


        lvcauthu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Listview.this, Detail.class);
                Cauthu cauthu = arraycauthu.get(i);
                intent.putExtra("ten", cauthu.getTen());
                intent.putExtra("noidung", cauthu.getNoidung());
                intent.putExtra("hinh", cauthu.getHinh());
                startActivity(intent);
            }
        });

        imgProfile= (Button) findViewById(R.id.imageviewProfile);
        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Listview.this, Profile.class);
                startActivity(back);
            }
        });


    }
    private  void Anhxa(){
        lvcauthu = (ListView) findViewById(R.id.listviewCauthu);
        arraycauthu = new ArrayList<>();

        arraycauthu.add(new Cauthu("Hoa cẩm tú cầu","5 thá ng 2, 1985","Cristiano Ronaldo dos Santos Aveiro GOIH ComM (phát âm tiếng Bồ Đào Nha: [kɾiʃˈtjɐnu ʁɔˈnaɫdu]; sinh ngày 5 tháng 2 năm 1985) là một cầu thủ bóng đá chuyên nghiệp người Bồ Đào Nha hiện đang thi đấu ở vị trí tiền đạo cho câu lạc bộ Premier League Manchester United và là đội trưởng của đội tuyển bóng đá quốc gia Bồ Đào Nha. Được coi là cầu thủ xuất sắc nhất thế giới và là một trong những cầu thủ vĩ đại nhất mọi thời đại,[8] Ronaldo là chủ nhân của 5 Quả bóng vàng châu Âu[ghi chú 3] và 4 Chiếc giày vàng châu Âu, cả hai đều là kỷ lục của một cầu thủ châu Âu. Anh đã giành được 32 danh hiệu trong sự nghiệp của mình, bao gồm 7 chức vô địch quốc gia, 5 UEFA Champions League, 1 UEFA European Championship và 1 UEFA Nations League. Ronaldo đang nắm giữ kỷ lục nam cầu thủ châu Âu có nhiều lần ra sân quốc tế nhất (189), cầu thủ ghi nhiều bàn thắng quốc tế nhất (117), cầu thủ ra sân nhiều nhất (183), ghi nhiều bàn thắng nhất (140) và có nhiều pha kiến tạo nhất (42) tại UEFA Champions League, cầu thủ ghi nhiều bàn thắng nhất giải vô địch bóng đá châu Âu (14).[9] Anh là một trong số ít những cầu thủ đã có hơn 1.100 lần ra sân và đã ghi hơn 800 bàn thắng trong sự nghiệp cho câu lạc bộ và đội tuyển quốc gia.[10]."
                ,R.drawable.camtucau));
        arraycauthu.add(new Cauthu("Hoa hồng","30 tháng 3, 1986","Sergio Ramos García (phát âm tiếng Tây Ban Nha: [ˈseɾxjo ˈramoz ɣaɾˈθi.a]; sinh ngày 30 tháng 3 năm 1986) là cầu thủ bóng đá chuyên nghiệp người Tây Ban Nha. Anh thi đấu ở vị trí trung vệ cho câu lạc bộ Paris Saint-Germain tại Ligue 1 và Đội tuyển bóng đá quốc gia Tây Ban Nha. Anh ấy chơi ở vị trí trung vệ cho Real Madrid trong 16 mùa giải,[3] nơi mà anh là đội trưởng trong sáu mùa giải.[4][5] Ramos đã từng chơi ở vị trí hậu vệ phải trước đó trong sự nghiệp của mình.[6] Được biết đến với khả năng ghi bàn và kỹ năng lãnh đạo, anh được nhiều người coi là một trong những hậu vệ và đội trưởng vĩ đại nhất trong lịch sử thể thao."
                ,R.drawable.hoahong));
        arraycauthu.add(new Cauthu("Hoa sen","1 tháng 8, 1984","Bastian Schweinsteiger (sinh ngày 1 tháng 8 năm 1984 tại Kolbermoor, Bayern, Đức) là cựu cầu thủ bóng đá người Đức thi đấu ở vị trí tiền vệ.[3] Tại Bayern Munchen anh được các cổ động viên âu yếm đặt cho biệt danh \"Fußballgott\" (tạm dịch: Vị thánh bóng đá).Anh đã trải qua 13 mùa giải ở Bayern München, anh ra sân khoảng 500 trận và ghi được 67 bàn thắng. Tại đây, Bastian Schweinsteiger giành được 8 danh hiệu vô địch Bundesliga, 7 danh hiệu DFB-Pokal, một danh hiệu UEFA Champions League, một danh hiệu FIFA Club World Cup, 2 danh hiệu DFB-Ligapokal[4]. Anh gia nhập Manchester United từ năm 2015 đến năm 2017. Sau đó anh chơi cho Chicago Fire cho đến khi giải nghệ.."
                ,R.drawable.hoasen));
        arraycauthu.add(new Cauthu("Hoa tulip","20 tháng 5, 1981","Iker Casillas Fernández sinh ngày 20 tháng 5 năm 1981 tại Madrid, là một cựu thủ môn người Tây Ban Nha và là một huyền thoại của câu lạc bộ Real Madrid của La Liga. Iker Casillas là thủ môn xuất sắc nhất thế giới các năm 2008, 2009, 2010, 2011, 2012 theo bình chọn của FIFPRO. Anh được biết đến là một trong những thủ môn xuất sắc nhất lịch sử bóng đá thế giới cũng như bóng đá đương đại.[3]"
                ,R.drawable.hoatulip));
        arraycauthu.add(new Cauthu("Hoa hướng dương","2 tháng 5, 1975","David Robert Joseph Beckham (OBE, sinh ngày 2 tháng 5 năm 1975) là một cựu cầu thủ bóng đá chuyên nghiệp người Anh từng thi đấu cho các câu lạc bộ Manchester United, Preston North End, Real Madrid, A.C. Milan, Los Angeles Galaxy, Paris Saint-Germain và đội tuyển quốc gia Anh ở vị trí tiền vệ. Anh đã có được trận đấu thứ 100 với đội tuyển Anh trong trận đấu với Pháp vào tháng 3 năm 2008. Anh là một trong những cầu thủ sút phạt xuất sắc nhất trong lịch sử bóng đá.."
                ,R.drawable.huongduong));
    }


}