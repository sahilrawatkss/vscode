import { useState, useEffect, useContext } from "react";

import { Box, styled } from "@mui/material";

import { DataContext } from "../context/DataProvider";

const Container = styled(Box)`
  height: 75vh;
  width: 100%;
`;

const ParentContainer = styled(Box)`
  display: flex;
  justify-content: flex-end; /* Move the Result component to the right side */
  align-items: flex-start; /* Move the Result component to the top side */
`;

const Result = () => {
  const { html, css, js } = useContext(DataContext);

  const [src, setSrc] = useState("");

  const srcCode = `
    <html>
        <body>${html}</body>
        <style>${css}</style>
        <script>${js}</script>
    </html>
`;

  useEffect(() => {
    const timeout = setTimeout(() => {
      setSrc(srcCode);
    }, 1500);

    return () => clearTimeout(timeout);
  });
  // }, [html, css, js]);

  return (
    <ParentContainer>
      <Container style={html || css || js ? null : { background: "#fafafa" }}>
        <iframe
          srcDoc={src}
          title="output"
          sandbox="allow-scripts"
          frameBorder="none"
          width="320%"
          height="173%"
        />
      </Container>
    </ParentContainer>
  );
};

export default Result;
