#!/bin/sh
echo "enter main path to be convert : "
read my_var
echo "enter folder name :"
read my_folder

##STORE WORKING DIR
cwd=$(pwd)

##CHANGE TO REPORT FOLDER
cd $my_var

## echo "Main path : $my_var | folder name :$my_folder"


_base="${my_var}/${my_folder}"
_dfiles="${_base}/*.jrxml"

if test -n "$(find ${_base} -maxdepth 1 -name '*.jrxml' -print -quit)"

then
    #CHECK FOR ALL FILES
    for f in $_dfiles
        do
        echo "[$(date)] Found =>${f}" >> "${_base}/log.txt"
        sed -i "" "s|\\\\\\\ppk\\\\\\\|//ppk//|g" ${f}
        done
fi

## echo "Change to cwd"
cd $cwd
