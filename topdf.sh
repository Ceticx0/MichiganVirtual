#!/bin/bash
cd "$1"
find . -type f \( -name "*.txt" -printf "1 %p\0" \) -o -name "*.java" -printf "2 %p\0" | sort -zn | cut -z -d' ' -f2- | xargs -0 enscript --header='$n' --margins=5:5:10:10 --color -Ejava -i0i -MLetter -fCourier8 -F CourierBold9 -o -  --word-wrap -t "$(basename "$1")"| ps2pdf - "$(basename "$1")/$(basename "$1").pdf"