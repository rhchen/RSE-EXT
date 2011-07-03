#!/bin/bash

workdir="/home/rhchen/works/build/rse"
rm -Rf ${workdir}
mkdir -p ${workdir}
echo "workdir is ${workdir}"

srcdir=${workdir}/src
mkdir -p ${srcdir}
echo "srcdir is ${srcdir}"

# Checkout source codes
echo "Fetch Source Codes from github ....."

cd ${srcdir}

git clone git://github.com/rhchen/RSE-EXT.git

