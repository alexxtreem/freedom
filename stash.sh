#!/usr/bin/env bash
#Envirenment section
destName='/home/alex/stashfile'
sourceName='/mnt/s3selectel'
fileName='main.htm'
#End env section

if [ -f $sourceName/$fileName ]
then
	mv $sourceName/$fileName $destName/
	chown alex:alex $destName/$fileName
	chmod 644 $destName/$fileName
fi

