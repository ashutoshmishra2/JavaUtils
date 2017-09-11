/**
 * @author Ashutosh Mishra [NNG]
 * @when 05 September 2017
 * @desc This class provides the utility for the unit conversion
 * like date, time, weight, length, etc[TODO: specify all]
 */
package org.nng.utils;

@SuppressWarnings("unused")
public class UnitConversion {
	//=============================================
	//Private Members
	//=============================================
	//If any
	
	//=============================================
	//Public Members
	//=============================================
	public String time_output;
	public String weight_output;
	public String length_output;
	
	//=============================================
	//Functions for time unit
	//=============================================
		/**
		 * @author Ashutosh Mishra [NNG]
		 * @param time_input
		 * @return String
		 */
		public java.lang.String minutesToHMSTime( double time_input ) {
			Integer a = (int) (time_input * 60) ;
			
			this.time_output = "" + a ;
			return this.time_output;
		}
		
		public java.lang.String secondsToHMSTime( long totalSeconds_input ) {
			long raw_minutes = 0, raw_seconds = 0;
			long hours = 0;
			long minutes = 0;
			long seconds = 0;
			
			
			if( totalSeconds_input > 59) {
				raw_minutes = (totalSeconds_input) / 60;
				if(raw_minutes > 59) {
					//H:M:S
					hours = totalSeconds_input / 3600;
					raw_seconds = totalSeconds_input - (hours * 3600);
					minutes = raw_seconds / 60;
					seconds = raw_seconds % 60;
					
				} else {
					//[00:M:S]
					hours = 0;
					minutes = totalSeconds_input / 60;
					seconds = totalSeconds_input % 60;
				}
				
			}else {
				//[00:00:S]
				seconds = totalSeconds_input;
			}
			
			//Final Value to be returned.
			this.time_output = hours + ":"+ minutes + ":" + seconds;
			return this.time_output;
		}
		
		
		
}