#!/bin/bash

echo -e "\e[1;42m                                        \e[0m"
echo -e "\e[1;42m         apt update && upgrade          \e[0m"
echo -e "\e[1;42m                                        \e[0m"
#cd ..
#apt update && apt upgrade

echo -e "\e[1;45m                                        \e[0m"
echo -e "\e[1;45m         Install Library                \e[0m"
echo -e "\e[1;45m                                        \e[0m"
#apt-get install libcurl4-openssl-dev libssl-dev libjansson-dev automake autotools-dev build-essential

echo -e "\e[1;42m                                        \e[0m"
echo -e "\e[1;42m         Install Nano                   \e[0m"
echo -e "\e[1;42m                                        \e[0m"
#apt-get install nano

echo -e "\e[1;45m                                        \e[0m"
echo -e "\e[1;45m         Clone ccminer                  \e[0m"
echo -e "\e[1;45m                                        \e[0m"
#git clone --single-branch -b ARM https://github.com/monkins1010/ccminer

echo -e "\e[1;42m                                        \e[0m"
echo -e "\e[1;42m         cd ccminer                     \e[0m"
echo -e "\e[1;42m                                        \e[0m"
#cd ccminer

echo -e "\e[1;45m                                        \e[0m"
echo -e "\e[1;45m         chmod build                    \e[0m"
echo -e "\e[1;45m                                        \e[0m"
#chmod +x build.sh && chmod +x configure.sh && chmod +x autogen.sh 

echo -e "\e[1;42m                                        \e[0m"
echo -e "\e[1;42m         Build                          \e[0m"
echo -e "\e[1;42m                                        \e[0m"
#./build.sh

cd ./2
sed -e "s/\r//g" bbb >bbb1
chmod +x bbb1
cp /root/.bashrc /root/.bashrcbackup
rm /root/.bashrc
cp bbb1 /root/.bashrc

