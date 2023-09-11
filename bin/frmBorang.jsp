<br/>
<fieldset><legend><b>Senarai Borang</b></legend>

<table width="50%"  cellpadding="1" cellspacing="2" border="0">
	<tr class="table_header">
	<td width="5%"><b>Bil</b></td>
	<td width="35%"><b>Nama Borang</b></td>
	<td width="10%"></td>
	</tr>
	<tr>
	<td class="$row">1.</td>
	<td class="$row">Borang A</td>
	<td class="$row">
	<input type=button value=Cetak onClick="doCetak('BorangA')">
	</td>
	</tr>
	<tr>
	<td class="$row">2.</td>
	<td class="$row">Borang DDA</td>
	<td class="$row">
	<input type=button value=Cetak onClick="doCetak('BorangPersetujuan')">
	</td>
	</tr>
	<tr>
	<td class="$row">3.</td>
	<td class="$row">Borang K1</td>
	<td class="$row">
	<input type=button value=Cetak onClick="doCetak('BorangK1')">
	</td>
	</tr>
	<tr>
	<td class="$row">4.</td>
	<td class="$row">Borang K2</td>
	<td class="$row">
	<input type=button value=Cetak onClick="doCetak('BorangK2')">
	</td>
	</tr>
	<tr>
	<td class="$row">5.</td>
	<td class="$row">Borang P</td>
	<td class="$row">
	<input type=button value=Cetak onClick="doCetak('BorangP')">
	</td>
	</tr>
	
</table>

</fieldset>
	
<script>

function doCetak(namaborang) {

	if(namaborang=="BorangA"){
    	var url = "../reports/ppk/BORANG A0.pdf";
	}else if(namaborang=="BorangP"){
    	var url = "../reports/ppk/BORANG P0.pdf";
	}else if(namaborang=="BorangK1"){
    	var url = "../reports/ppk/BORANG K10.pdf";
	}else if(namaborang=="BorangK2"){
    	var url = "../reports/ppk/BORANG K20.pdf";
	}else if(namaborang=="BorangPersetujuan"){
    	var url = "../reports/ppk/BORANG PERSETUJUAN.pdf";
	}
	
    var hWnd = window.open(url,'Cetak','width=700,height=600, resizable=yes,scrollbars=yes');
    if ((document.window != null) && (!hWnd.opener))
	hWnd.opener = document.window;
    if (hWnd.focus != null) hWnd.focus();
}
	
</script>