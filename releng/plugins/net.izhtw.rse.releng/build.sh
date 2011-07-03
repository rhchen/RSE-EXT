#!/bin/bash

eclipseDist="/home/rhchen/Downloads/eclipse/eclipse/eclipse-SDK-3.7-linux-gtk.tar.gz"
cdtDist="/home/rhchen/Downloads/eclipse/cdt/cdt-master-8.0.0-I201106081058.zip"

workDir="/home/rhchen/works/build/rse"
rm -Rf ${workDir}
mkdir -p ${workDir}
echo "workdir is ${workDir}"

buildDirectory=${workDir}/buildDirectory
mkdir -p ${buildDirectory}
echo "buildDirectory is ${buildDirectory}"

baseLocation=${workDir}/baseLocation
mkdir -p ${baseLocation}
echo "baseLocation is ${baseLocation}"

buildConfiguration=${workDir}/buildConfiguration
mkdir -p ${buildConfiguration}
echo "buildConfiguration is ${buildConfiguration}"

srcDir=${workDir}/src
mkdir -p ${srcDir}
echo "srcdir is ${srcDir}"

# Checkout source codes
echo "Fetch Source Codes from github ....."

cd ${srcDir}
git clone git://github.com/rhchen/RSE-EXT.git

cd ${baseLocation}
tar -xzvf ${eclipseDist}
unzip -o -d cdt ${cdtDist}
cp -Rf cdt/plugins/* eclipse/plugins/
cp -Rf cdt/features/* eclipse/features/
