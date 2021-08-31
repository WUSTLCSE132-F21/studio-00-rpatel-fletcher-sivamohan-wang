int time = 0;
int pin = 13;
void setup() {
  Serial.begin(9600);
  pinMode(pin, OUTPUT);
  
}

void loop() {
  digitalWrite(pin, HIGH);
  delay(500);
  digitalWrite(pin, LOW);
  Serial.print(time);
  Serial.println(" sec have elapsed");
  delay(500);
    Serial.println(millis());

  ++time;
}
