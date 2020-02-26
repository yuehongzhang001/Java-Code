PrintWriter outputFile = new PrintWriter(new File("Sorted_Averages.txt"));
		int startScan, index, minIndex;
		String minMonthStr;
		double minValue;
		for (startScan = 0; startScan < (monthAverage.length-1); startScan++) {
			minIndex = startScan;
			minValue = monthAverage[startScan];
			minMonthStr = months[startScan];
			for(index = startScan + 1; index < monthAverage.length; index++) {
				if (monthAverage[index] < minValue) {
					minValue = monthAverage[index];
					minIndex = index;
					minMonthStr = months[index];
				}
			}
			monthAverage[minIndex] = monthAverage[startScan];
			months[minIndex] = months[startScan];
			monthAverage[startScan] = minValue;
			months[startScan]= minMonthStr;
			outputFile.printf("%s: %.3f\n", months[minIndex],monthAverage[minIndex]);
		}
		outputFile.close();
		}
		
	}