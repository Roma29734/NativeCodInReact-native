import React from "react";
import { Button, View, NativeModules } from "react-native";

const App = () => {

  // Init native module
  const { CalendarModule } = NativeModules;

  const onPress = async () => {
    // Using the native module

    await CalendarModule.showView();

    CalendarModule.createCalendarEvent(
      "testName",
      "testLocation",
      (error: string) => {
        console.error(`Error found! ${error}`);
      },
      (eventId: string) => {
        console.log(`event id ${eventId} returned`);
      }
    );
  };

  return (
    <View style={{
      flex: 1,
      alignItems: "center",
      justifyContent: "center"
    }}>
      <Button
        title="Click to invoke your native module!"
        color="#841584"
        onPress={onPress}
      />
    </View>
  );
};

export default App;
