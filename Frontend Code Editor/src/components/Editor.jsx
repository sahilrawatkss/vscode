import { useState } from "react";

import "codemirror/lib/codemirror.css";
import "codemirror/theme/material.css";
import "codemirror/mode/xml/xml";
import "codemirror/mode/javascript/javascript";
import "codemirror/mode/css/css";

import { Controlled as ControlledEditor } from "react-codemirror2";

import { Box, styled } from "@mui/material";
import CloseFullscreenIcon from "@mui/icons-material/CloseFullscreen";

import "../App.css";

const Container = styled(Box)`
  flex-grow: 50;
  flex-basic: 0;
  display: flex;
  flex-direction: column;
  padding: 0 8px 0;
`;

const Logo = styled(Box)`
  background: #1d1e22;
  padding: 9px 12px;
  display: flex;
`;

const Header = styled(Box)`
  display: flex;
  justify-content: space-between;
  background: #060606;
  color: #aaaebc;
  font-weight: 700;
`;

const Editor = ({ heading, icon, color, value, onChange }) => {
  const [open, setOpen] = useState(true);

  const handleChange = (editor, data, value) => {
    onChange(value);
  };

  return (
    <Container style={open ? null : { flexGrow: 1 }}>
      <Header>
        <Logo>
          <Box
            component="span"
            style={{
              background: color,
              height: 18,
              width: 18,
              display: "flex",
              placeContent: "center",
              borderRadius: 5,
              marginRight: 2,
              paddingBottom: 2,
              color: "black",
            }}>
            {icon}
          </Box>
          {heading}
        </Logo>
        <CloseFullscreenIcon
          className="Full-screen-Icon"
          fontSize="small"
          style={{ alignSelf: "center" }}
          onClick={() => setOpen((prevState) => !prevState)}
        />
      </Header>
      <ControlledEditor
        className="controlled-editor"
        value={value}
        onBeforeChange={handleChange}
        options={{
          theme: "material",
          lineNumbers: true,
        }}
      />
    </Container>
  );
};

export default Editor;
