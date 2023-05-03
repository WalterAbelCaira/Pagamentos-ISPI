/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

       

            function startclock()
            {
                var thetime = new Date();

                var nhours = thetime.getHours();
                var nmins = thetime.getMinutes();
                var nsecn = thetime.getSeconds();
                var nday = thetime.getDay();
                var nmonth = thetime.getMonth();
                var ntoday = thetime.getDate();
                var nyear = thetime.getYear();
                var AorP = " ";

                if (nhours >= 12)
                    AorP = "P.M";
                else
                    AorP = "A.M";

                if (nhours >= 13)
                    nhours -= 12;

                if (nsecn < 10)
                    nsecn = "0" + nsecn;

                if (nmins < 10)
                    nmins = "0" + nmins;

                if (nday == 0)
                    nday = "Domingo";
                if (nday == 1)
                    nday = "Segunda-Feira";
                if (nday == 2)
                    nday = "Terça-Feira";
                if (nday == 3)
                    nday = "Quarta-Feira";
                if (nday == 4)
                    nday = "Quinta-Feira";
                if (nday == 5)
                    nday = "Sexta-Feira";
                if (nday == 6)
                    nday = "Sábado";

                nmonth += 1;

                if (nyear <= 99)
                    nyear = "19" + nyear;

                if ((nyear > 99) && (nyear < 2000))
                    nyear += 1900;

                document.getElementById("datahora").innerHTML = "<span class='glyphicon glyphicon-time'>  </span> "+ nhours + ": " + nmins + ": " + nsecn + " " + AorP + "  |  " + nday + ", " + ntoday + "/" + nmonth + "/" + nyear;
                setTimeout('startclock()', 1000);
            }
          
