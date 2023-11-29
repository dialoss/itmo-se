chmod -R 777 lab0
rm -r lab0

mkdir lab0
cd lab0

echo "Способности Overgrow Inner Focus Leaf" > grotle4
echo "Guard" >> grotle4
echo "Развитые способности Friend" > igglybuff0
echo "Guard" >> igglybuff0

mkdir jolteon9
cd jolteon9
echo "satk=15 sdef=9 spd=8" > chandelure
echo "satk=6 sdef=5" > kricketune
echo "spd=7" >> kricketune
echo "Тип диеты Herbivore" > whismur
echo "satk=6 sdef=5" > cherrim
echo "spd=7" >> cherrim
echo "Xоды Aqua Tail Bind Body Slam Dark Pulse Double-Edge" > ekans
echo "Gastro Acid Giga Drain Gunk Shot Iron Tail Seed Bomb Sleep Talk Snatch" >> ekans
echo "Snore Spite" >> ekans
touch nidorina

chmod 066 chandelure
chmod 751 nidorina
chmod ug+r kricketune
chmod 400 whismur
chmod 444 cherrim
chmod 400 ekans

cd ..

echo "weigth 96.6 height=39.0 atk=8 def=6" > purugly7
mkdir -p salamence7/{drapion,torterra,frillish,sandshrew,spheal}

cd salamence7

chmod u+rwx,g+rx,o+wx drapion
chmod 537 torterra
chmod 317 frillish
chmod 311 sandshrew
chmod 576 spheal
cd ..

mkdir -p venonat4/paras

cd venonat4

echo "Ходы" > pidove
echo "Heat Wave Roost Sky Attack Sleep Talk Snore Tailwind" >> pidove
echo "Uproar" >> pidove

echo "satk=4 sdef 6 spd=4" > sewaddle
echo "Способности Tail Whip" > dewott
echo "Water Gun Water Sport Focus Energy Razor Shell Fury Cutter Water Pulse" >> dewott
echo "Revenge Aqua Jet Encore Aqua Tail Retaliate Swords Dance Hydro" >> dewott
echo "Pump" >> dewott

echo "Способности Last Chance Cute Charm Hustle" > igglybuff

chmod 400 pidove
chmod 640 sewaddle
chmod 440 dewott
chmod 771 paras
chmod 620 igglybuff

cd ~/opd/lab0
chmod 044 grotle4
chmod 400 igglybuff0 
chmod ug+wx,o+rx jolteon9 
chmod 604 purugly7
chmod 736 salamence7
chmod 770 venonat4

ln purugly7 ./jolteon9/whismurpurugly
ln -s jolteon9 Copy_72
cp purugly7 ./salamence7/spheal
cat purugly7 > ./jolteon9/kricketunepurugly
cp -r jolteon9 ./salamence7/frillish
ln -s purugly7 ./venonat4/pidovepurugly
cat ./jolteon9/ekans ./jolteon9/kricketune > ./grotle4_14

cd jolteon9
wc -m ekans kricketune whismur cherrim | sort 2> echo 
cd ~/opd/lab0/venonat4
ls | sort -r
cd ~/opd/lab0
cat -b igglybuff0 | grep -E -v "d^"
chmod u+r grotle4
cat grotle4 | grep -E ".*sa.*" &> echo
cd ~/opd/lab0

cat $(echo i* */i*) | sort -r
mkdir -p ~/opd/lab0/tmp/
mkdir -p ~/opd/lab0/tmp/
wc -l $(ls -p | grep -v /) 2> ~/opd/lab0/tmp/errors 1>  ~/opd/lab0/tmp/result

rm ~/opd/lab0/grotle4
rm ~/opd/lab0/jolteon9/ekans

rm $(ls -R | grep -E "Copy_.*")
cd ~/opd/lab0
rm $(ls | grep -E "whismurpurug.*")
rm -r ~/opd/lab0/venonat4
rm ~/opd/lab0/salamence7/torterra
